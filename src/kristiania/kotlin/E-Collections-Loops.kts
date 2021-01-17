// While and For loops iwhi
var i = 0
while (i < 10) {
    println(i)
    i++
}

for (i in 0 until 10){
    println(i)
}

// Mutable List
val list = mutableListOf<Int>(1,2,3,4,5,6)
list.add(7)
list.remove(2)
// Filter the list, transform and print each item
list.forEach { value ->
    println(value)
}

list.filter { it<5 }.map { it *3 }.forEach { println(it) }

// Do this Exercise Write an extension function for String class to return the count count of vowels in that string.














