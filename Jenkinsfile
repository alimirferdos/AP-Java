pipeline {
  agent {
    node {
      label 'master'
    }

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