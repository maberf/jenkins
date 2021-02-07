def gv //variável groovy

pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
    stages {
        stage("init") {
            steps {
                script {
                   gv = load "script.groovy" //arquivo externo
                }
            }
        }
        stage("build") {
            steps {
                script {
                    gv.buildApp() //chama função
                }
            }
        }
        stage("test") {
            when {
                expression {
                    params.executeTests
                }
            }
            steps {
                script {
                    gv.testApp() //chama função
                }
            }
        }
        stage("deploy") {
            steps {
                script {
                    gv.deployApp() //chama função
                }
            }
        }
    }   
}