// Initials
// Print
println("Hello World")

// Properties (Mutable and Immutable)
val a: Int = 1
var b: Double = 2.0
b = 3.0


// Null safety

var name: String? = "Imran"
name = null


// Type Inference recognize the typ if value assigned to the variable

var i = 0
val s = "Imran"


// String handling

val greeting = """
    Hi,   
      
      
      
    ${s.toUpperCase()}
""".trimIndent()
println(greeting)

// Statements as Expressions If and when

val limit = 80
val speed = 90
val fine = if (speed > limit) {
    "Yes"
} else {
    "No"
}

val result = when (2) {
    1 -> "One"
    2 -> "Two"
    else -> "Nothing"
}

println("$fine, $result")

// Writting mutable nullable variables are frouned up on.


