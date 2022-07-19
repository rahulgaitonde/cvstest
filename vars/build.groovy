def build(dockerImageName)
    {
        pwd
        sh "docker build -t ${dockerImageName} ."
        echo "Image Got Build ${dockerImageName}"
        sh "docker image"
    }

def run(dockerImageName)
{
    sh "docker run -dit --name catalina -p 8083:8080 ${dockerImageName}"
    sh "docker ps"
    sh "docker cp javamaven:/usr/local/tomcat/webapps/wizard.war /tmp"
}

