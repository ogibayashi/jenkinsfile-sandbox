def call(body) {
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = config
  body()

  age = getConfig(config.name)
  echo "helloWrapper ${age}"
}
