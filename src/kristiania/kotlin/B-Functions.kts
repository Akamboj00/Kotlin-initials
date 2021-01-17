//void void
// void return
// parameter
//fun greetings() = println("Hi there")

greetings(greet = "Vola", name = "Tom")


// Simplify with an equal


// Default parameters & named parameter
fun greetings(name: String, greet: String = "Hi") = println("$greet there, $name")

//Extension functions (speeding ticket)

fun Int.shouldIssueSpeedingTicket(): String {
    val limit = 90
    return if (this > limit) {
        "Yes"
    } else {
        "No"
    }
}
println(100.shouldIssueSpeedingTicket())
