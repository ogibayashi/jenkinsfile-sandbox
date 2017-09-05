@Library('my-shared-library') _
pipeline {
  agent any
  stages {
    stages('Example') {
      echo "${params.Greeting} world!"
      echo "Message: ${helloMessage}"
    }
  }
}
