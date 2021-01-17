//void void
// void return
// parameter

fun greetings(greet: String = "Hi", name: String) = "$greet $name"


// Simplify with an equal


// Default parameters & named parameter

println(greetings(name = "Torkel", greet = "Hello"))

val s = "Hello there"
s.print()

//Extension functions

fun String.print() {
    println(this)
}
