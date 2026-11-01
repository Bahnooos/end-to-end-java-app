pipeline {
    agent any
    
   tools {
        maven 'maven-3.10'
    }
        stage('Build Jar') {
            steps {
                script {
                    echo 'Building the application...'
                    sh 'mvn package'
                }
                
            }}
        stage('Build Image') {
            steps {
                script {
                    echo 'Building the Docker Image...'
                    sh 'docker build -t bahnas/demo-app:v1.0 .'
                    withCredentials([usernamePassword(credentialsId: 'docker-hub', passwordVariable: 'DOCKER_PASSWORD', usernameVariable: 'DOCKER_USERNAME')]) {
                        sh ' echo $DOCKER_PASSWORD | docker login -u $DOCKER_USERNAME --password-stdin'
                    }
                    sh 'docker push bahnas/demo-app:v1.0'
               
                }
                
            }}

        stage('deploy') {
            steps {     
                script {
                     echo 'Deploying the application...'
                }               
                    
            }
        }        
    }

