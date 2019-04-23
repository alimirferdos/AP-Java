pipeline {
  agent {
    node {
      label 'master'
    }
  }
  tools {
        // Note: this should match with the tool name configured in your jenkins instance (JENKINS_URL/configureTools/)
    maven "mvn"
    docker "docker"
  }
  stages {
    stage('Code Clone') {
      steps {
        git 'https://github.com/alimirferdos/AP-Java'
      }
    }
    stage('Build') {
      agent {
          docker { image 'maven:3-alpine' }
      }
      steps {
        sh 'mvn -B -DskipTests clean package'
      }
    }
  }
}
