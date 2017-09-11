// def getConfig(String name='Alice') {
//   [ 'Alice': ['name': 'Alice', 'age': 10],
//     'Bob': ['name': 'Bob','age': 20 ]
//   ]
// }

def call(String name='human') {
  try {
    def person = getConfig.config.get(name)
    echo "${person.get(name)}"
    echo "Hello, ${name}!"
    echo "Hello, test ${person['Alice']['name']}!"
    echo "Hello, ${name}!, Your age is ${person['age']}"
  }
  catch(e) {
    echo "No such name ${name}"
  }
}

