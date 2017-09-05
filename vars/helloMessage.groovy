def person = [
  'Alice': ['name': 'Alice', 'age': 10],
              'Bob': ['name': 'Bob','age': 20 ]
]

def call(String name='human') {
  //  echo "Hello, ${name}!, Your age is ${person['Alice']['age']}"
  echo "Hello, ${name}!"
}


