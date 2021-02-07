pipeline {
    agent any
    environment {
        NEW_VERSION = '1.3.0'
        SERVER_CREDENTIALS = credentials('global')
    }
    stages {
        stage("build") {
            steps {
                echo 'construindo a aplicação'
                echo "building version ${NEW_VERSION}"
            }
        }
        stage("test") {
            steps {
                echo 'testando a aplicação'
            }
        }
        stage("deploy") {
            steps {
                echo 'implantando a aplicação'
                echo "deploying aplications with ${SERVER_CREDENTIALS}"
                sh "${SERVER_CREDENTIALS}"
            }
        }
    }   
}