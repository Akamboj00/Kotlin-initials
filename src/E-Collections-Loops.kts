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
val list = mutableListOf(1, 2, 3, 4, 5, 6)
list.add(7)
list.remove(2)
println(list.size)

// Filter the list, transform and print each item
val newlist = list.filter { it < 5 }.map { it * 2 }.forEach { print(it) }

// Mutable Map
val map = mutableMapOf<Int, String>(1 to "One", 2 to "Two")
println(newlist)














