pipeline {
    agent any
    tools {
        gradle 'Gradle-6.5' // tools without wrapper
    }
    stages {
        stage("run frontend") {
            steps {
                echo 'executando yarn...'
                nodejs('NodeJS-10.19') { //wrapper
                    sh 'yarn install'
                }
            }
        }
        stage("run backend") {
            steps {
                echo 'executando gradle...'
                    sh './gradle -v'
            }
        }
    }   
}