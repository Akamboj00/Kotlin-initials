// Higher order functions are functions that take functions as parameters.

fun greetings(func: (String) -> Unit) {
    func("Arun")
}

greetings() { name ->
    print("Hi, $name")
}


// Syntax for creating a lambda witth parameter

