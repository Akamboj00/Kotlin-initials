// Higher order functions are functions that take functions as parameters.

fun greetings(func : ()-> String){
    val s = func()
    println(s)
}

fun defineFunc() : String{
    return "Hi there"
}

greetings(::defineFunc)

greetings {
    "Hi There anonymous"
}

// Syntax for creating a lambda

