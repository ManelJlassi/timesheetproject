pipeline {
    agent any
    tools {
        jdk 'JAVA_HOME'
        maven 'M2_HOME'
    }
    stages {
        stage('GIT') {
            steps {
                git branch: 'master',
                url: 'https://github.com/ManelJlassi/timesheetproject.git'
            }
        }
        stage('Compile Stage') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('SonarQube Analysis') {
    steps {
        sh 'mvn sonar:sonar -Dsonar.host.url=http://192.168.33.10:9000 -Dsonar.token=sqa_addd33599cb3b32e39db58b6c875022fd2db7fbc'
    }
}
    }
}