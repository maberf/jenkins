def buildApp() { //função
    echo 'building the aplication - construindo a aplicação'
}

def testApp() { //função
    echo 'testing the aplication - testando a aplicação'
}

def deployApp() { //função
    echo 'deploying the aplication - implantando a aplicação'
    echo "deploing version ${params.VERSION}" //variável de ambiente
}

return this