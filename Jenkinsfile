pipeline {
  agent {
    node {
      label 'master'
    }
  }
  tools {
        // Note: this should match with the tool name configured in your jenkins instance (JENKINS_URL/configureTools/)
    maven "Maven 3.6.0"
  }
  stages {
    stage('Code Clone') {
      steps {
        git 'https://github.com/alimirferdos/AP-Java'
      }
    }
    stage('Build') {
      steps {
        sh 'mvn -B -DskipTests clean package'
      }
    }
  }
}
