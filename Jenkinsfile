pipeline {
    agent any
    
    parameters {
        choice(name:'version', choices:['1.0.0', '1.1.0', '1.2.0'], description:'Select the version of the application')
        booleanParam(name: ' valid_test', defaultValue: true,description: 'Is this a valid test?')
    }
    stages {
        stage('Build') {
            steps {
                echo "Building the application..."
                
            }
        }
        stage('Docker Build') {
               when{
                    expression { 
                        params.valid_test 
                        params.version == '1.2.0'
                     }
                }
            steps {
                echo 'Building the Docker image...'
                
            }
        }
        stage('Docker Run') {
            steps {
                echo 'Running the Docker container...${params.version}'             
            }
        }        
    }
}
