// Initials
// Print
println("Hello World")

// Properties (Mutable and Immutable)
val a : Int = 0
var b : Double? = 2.0
b = 10.0


// Null safety
b = null


// Type Inference recognize the typ if value assigned to the variable
val name = "Tom"

// String handling

val greatings = "Hi, ${name.toUpperCase()}"
println(greatings)

// Statements as Expressions If and when -(jspeed)

val limit = 80
val speed = 90
val fine = if (speed > limit) {
    "Yes"
} else {
    "No"
}
var s = 10
val x = when (s){
    1-> "One"
    2-> "Two"
    else -> ""
}

// Writing mutable nullable variables are frowned up on.


