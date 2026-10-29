def gv
pipeline {
    agent any
    
    parameters {
        choice(name:'version', choices:['1.0.0', '1.1.0', '1.2.0'], description:'Select the version of the application')
        booleanParam(name: ' valid_test', defaultValue: true,description: 'Is this a valid test?')
    }
    stages {
        stage('init') {
            steps {
                script {
                gv = load 'script.groovy'
                }
            }
        }
        stage('Build') {
            steps {
                script {
                gv.buildApp() 
                }
                
            }
        }
        stage('test') {
               when{
                    expression { 
                        params.valid_test 
                        params.version == '1.2.0'
                     }
                }
            steps {
                script {
                gv.testApp()                
                }
            }
        }
        stage('deploy') {
            steps {     
                script {
                     gv.deployApp()  
                }               
                    
            }
        }        
    }
}
