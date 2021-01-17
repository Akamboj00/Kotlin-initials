// While and For loops
for (i in 0 until 100) {
    //println(i)
}

// Mutable List
val list = mutableListOf(1, 2, 3, 4, 5, 6)
/*list.add(7)
list.remove(2)*/
println(list)

val func: (Int) -> Unit = {
    println(it)
}

func(2)

val newlist = list.map { it * 2 }.filter { it < 10 }

// Mutable Map
val map = mutableMapOf<Int, String>(1 to "One", 2 to "Two")
println(newlist)














