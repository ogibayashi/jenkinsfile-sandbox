node {
  parameters {
    string(name: 'Greeting', defaultValue: 'Hello', description: 'How should I greet the world?')    booleanParam(name: 'boolTest', defaultValue: true, description: 'boolean paramter')
  }
  stages {
    stages('Example') {
      echo "${params.Greeting} world!"
    }
  }
}
