pipeline {
  agent {
    node {
      label 'master'
    }
  }
  tools {
        // Note: this should match with the tool name configured in your jenkins instance (JENKINS_URL/configureTools/)
    maven "mvn"
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
