pipeline {
    agent any

    options {
      buildDiscarder logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '50')
    }

    parameters {
      choice choices: ['info', 'quiet', 'debug', 'stacktrace'], description: 'please choose the gradle log level', name: 'logLevel'
    }

    triggers {
      pollSCM '* * * * *'
    }

    stages {
        stage('source') {
            steps {
                git credentialsId: 'kaliu-github-repo-cred', url: 'git@github.com:kabourne/fizzbuzz.git'
            }
        }
        stage('clean and unit test') {
            steps {
                sh './gradlew clean test --$logLevel'
            }
        }
        stage('check') {
            steps {
                sh './gradlew check --$logLevel'
            }
        }
        stage('assemble') {
            steps {
                sh './gradlew assemble -PsourceBuildNumber=$BUILD_NUMBER --$logLevel'
            }
        }
        stage('publish') {
            steps {
                timeout(3) {
                    withCredentials([usernamePassword(credentialsId: 'fizzbuzz-nexus-repo-cred', passwordVariable: 'NEXUS_PASSWORD', usernameVariable: 'NEXUS_USERNAME')]) {
                        sh './gradlew publishFizzbuzzPublicationToRemoteNexusRepository
                        -PnexusUsername=$NEXUS_USERNAME
                        -PnexusPassword=$NEXUS_PASSWORD
                        -PsourceBuildNumber=$BUILD_NUMBER
                        --$logLevel'
                    }
                }
            }
        }
    }

    post {
        always {
            junit '**/test-results/test/*.xml'
        }
        success {
            archiveArtifacts artifacts: '**/libs/*.jar', fingerprint: true, followSymlinks: false
        }
    }
}
