// Class with constructor
class Number(private val value: Int) {

    constructor() : this(1)

    // Init always get called when a class is initialized
    init {
        println(value)
    }

}

val num = Number()

//Inheritance : Every class in final
open class Vehicle {

}

class Car : Vehicle() {
    val maxSpeed: Int = 250
    val engine: String = "v-12"

    fun drive() {
        println("Driving...")
    }
}



