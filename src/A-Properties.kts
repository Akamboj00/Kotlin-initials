// Initials
// Print
println("Hello World")

// Properties (Mutable and Immutable)
val i: Int = 1
var j: Double = 2.0
j = 3.0

// Null safety
var x: String? = null
x = "A name"
println(x)

// Type Inference recognize the typ if value assigned to the variable
var name = "imran"

// String handling
val greetings = "Hi, ${name.capitalize()}"
println(greetings)

// Statements as Expressions
val limit = 80
val speed = 100
val payFine = if (speed > limit) {
    "Yes"
} else {
    "No"
}
println(payFine)

val s = 1
val one = when (s) {
    1 -> "One"
    2 -> "Two"
    else -> "No idea"
}
println(one)


