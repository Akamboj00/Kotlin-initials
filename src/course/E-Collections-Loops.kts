// While and For loops

var i = 0
while (i < 10) {
    println(i)
    i++
}

for (i in 0 until 10) {
    println(i)
}

// Mutable List

val list: List<Int> = mutableListOf<Int>(1, 2, 3, 4, 5, 6)
list.forEach { item ->
    print(item)
}

list.filter { it < 4 }.map { it * 2 }.forEach {
    print(it)
}

// Filter the list, transform and print each item

// Mutable Map

val map: Map<Int, String> = mutableMapOf<Int, String>(1 to "One", 2 to "Two")

map.forEach { key, value ->
    println("$key, $value")
}















