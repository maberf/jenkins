pipeline {
    agent any
    stages {
        stage("run frontend") {
            steps {
                echo 'executando yarn...'
                nodejs('NodeJS-10-19') { //wrapper
                    sh 'yarn install'
                }
            }
        }
        stage("run backend") {
            steps {
                echo 'executando gradle...'
                withGradle() { //wrapper
                    sh './gradlew -v'
                }
            }
        }
    }   
}