def call(String name='human') {
  def person = getConfig()
  echo "Hello, ${name}!, Your age is ${person['Alice']['age']}"
  echo "Hello, ${name}!"
}

