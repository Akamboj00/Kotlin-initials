// class, constructor, init, extent
open class Vehicle(private val fuel: String) {

    constructor() : this("Diesel")

    init {
        println(fuel)
    }

    fun drive() {
        println("driving...")
    }
}

Vehicle("Petrol").drive()
Vehicle().drive()

class Car : Vehicle("Banana peel")

Car().drive()






