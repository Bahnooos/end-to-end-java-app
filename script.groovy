

def buildApp() {
    echo "Building the application..."
} 

def testApp() {
    echo 'Building the Docker image...'
} 

def deployApp() {
    echo "Running the Docker container...${params.version}"
} 

return this