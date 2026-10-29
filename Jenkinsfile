pipeline {
    agent any
    environment {
        APP_VERSION = '1.0-SNAPSHOT'
    }
    stages {
        stage('Build') {
            steps {
                echo "Building the application... ${APP_VERSION}"
                
            }
        }
        stage('Docker Build') {
            steps {
                echo 'Building the Docker image...'
                
            }
        }
        stage('Docker Run') {
            steps {
                echo 'Running the Docker container...'      
                with([usernamePassword(credentialsId: 'server_crd',usernameVariable: 'USERNAME',passwordVariable: 'PASSWORD')]){
                    echo " some script ${USERNAME} and ${PASSWORD}"
                }          
            }
        }
        
    }
    post{
            always {
                echo ' done!!! '
            }
            failure {
                echo 'Build failed!'
            }
        }
}
