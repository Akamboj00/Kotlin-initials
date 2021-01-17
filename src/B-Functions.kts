//void void
// void return
// parameter


// Simplify with an equal
fun greetings() = println("Hi there")

fun getGreetings() = "Hi there"

// Default parameters & named parameter
fun greet(hi: String, name: String = "Arun") {
    println("$hi, $name")
}

greet(name = "Torken", hi = "Hi")


