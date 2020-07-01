node {
    stage('source') {
        git credentialsId: 'kaliu-github-repo-cred', url: 'git@github.com:kabourne/fizzbuzz.git'
    }
    stage('clean and unit test') {
        try {
            sh './gradlew clean test'
        } finally {
            junit '**/test-results/test/*.xml'
        }
    }
    stage('check') {
        sh './gradlew check'
    }
    stage('assemble') {
        try {
            sh './gradlew assemble -PsourceBuildNumber=$BUILD_NUMBER'
        } finally {
            archiveArtifacts artifacts: '**/libs/*.jar', fingerprint: true, followSymlinks: false
        }
    }
}
