// Higher order functions

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

val func: (Int) -> Unit = { value ->
    if (value == 1) {
        print("One")
    }
}

func(1)
//