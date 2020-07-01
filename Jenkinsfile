node {
    stage('source') {
        git credentialsId: 'kaliu-github-repo-cred', url: 'git@github.com:kabourne/fizzbuzz.git'
    }
    stage('clean and unit test') {
        sh './gradlew clean test'
    }
    stage('check') {
        sh './gradlew check'
    }
    stage('assemble') {
        sh './gradlew assemble -PsourceBuildNumber=$BUILD_NUMBER'
    }
}
