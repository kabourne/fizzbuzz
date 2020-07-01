properties([
    buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '50')),
    parameters([choice(choices: ['info', 'quiet', 'debug', 'stacktrace'], description: 'please choose the gradle log level', name: 'logLevel')]),
    pipelineTriggers([pollSCM(ignorePostCommitHooks: true, scmpoll_spec: '* * * * *')])
])

node {
    stage('source') {
        git credentialsId: 'kaliu-github-repo-cred', url: 'git@github.com:kabourne/fizzbuzz.git'
    }
    stage('clean and unit test') {
        try {
            sh './gradlew clean test --$logLevel'
        } finally {
            junit '**/test-results/test/*.xml'
        }
    }
    stage('check') {
        sh './gradlew check --$logLevel'
    }
    stage('assemble') {
        try {
            sh './gradlew assemble -PsourceBuildNumber=$BUILD_NUMBER --$logLevel'
        } finally {
            archiveArtifacts artifacts: '**/libs/*.jar', fingerprint: true, followSymlinks: false
        }
    }
    stage('publish') {
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




