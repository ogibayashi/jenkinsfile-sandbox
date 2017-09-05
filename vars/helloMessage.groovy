def person = [
  [
    'name': 'Alice',
   'age': 10
  ],
  [
    'name': 'Bob',
   'age': 20
  ]
]

def call(String name='human') {
  echo "Hello, ${person[name]}!"
}


