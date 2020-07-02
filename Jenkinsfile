pipeline {
    agent any

    stages {
        stage('source') {
            steps {
                git credentialsId: 'kaliu-github-repo-cred', url: 'git@github.com:kabourne/fizzbuzz.git'
            }
        }
        stage('clean and unit test') {
            steps {
                sh './gradlew clean test'
            }
        }
        stage('check') {
            steps {
                sh './gradlew check'
            }
        }
        stage('assemble') {
            steps {
                sh './gradlew assemble -PsourceBuildNumber=$BUILD_NUMBER'
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
