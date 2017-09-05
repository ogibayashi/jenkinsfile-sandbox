@Library('my-shared-library') _
pipeline {
  agent any
  parameters {
    string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
  }  
  stages {
    stage('Example') {
      steps {
        echo "Hello world, ${params.PERSON}!"
        helloMessage(params.PERSON)
        helloMessage 'world'
      }
    }
  }
}
