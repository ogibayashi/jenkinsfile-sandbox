def getConfig(String name='Alice') {
  [ 'Alice': ['name': 'Alice', 'age': 10],
    'Bob': ['name': 'Bob','age': 20 ]
  ]
}

def call(String name='human') {
  def person = getConfig(name)
  echo "${person}"
  age = person[name]['age']
  echo "Hello, ${name}!"
  echo "Hello, test ${person['Alice']['name']}!"
  echo "Hello, ${name}!, Your age is ${age}"
}

