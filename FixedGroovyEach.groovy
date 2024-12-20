```groovy
def myMethod(List<String> list) {
  list?.each { element ->
    println element.toUpperCase() ?: "List is null or empty"
  }
}

myMethod(null)
myMethod(['apple', 'banana']) 
```