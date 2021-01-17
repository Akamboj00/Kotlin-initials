// Higher order functions are functions that take functions as parameters.

fun greetFun(func: () -> String) {
    val name: String = func()
    println("Hi, $name")
}

greetFun(func = {
    "tom"
})

greetFun {
    "Tom"
}

// Syntax for creating a lambda witth parameter
val func: (Int) -> Unit = { value ->
    if (value == 1) {
        print("One")
    }
}

func(1)
