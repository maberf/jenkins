pipeline {
    agent any
    parameters {
        //string(name:'VERSION', defaultValue: '', description: 'version to deploy on production')
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
    stages {
        stage("build") {
            steps {
                echo 'construindo a aplicação'
            }
        }
        stage("test") {
            when {
                expression {
                    params.executeTests == true
                }
            }
            steps {
                echo 'testando a aplicação'
            }
        }
        stage("deploy") {
            steps {
                echo 'implantando a aplicação'
                echo "deploying version ${params.VERSION}"
            }
        }
    }   
}