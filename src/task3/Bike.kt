package task3

class Bike(val type: String) : Vehicle {
    override fun start() {
        println("Bike is starting...")
    }

    override fun stop() {
        println("Bike is stopping...")
    }

    override fun displayInfo() {
        println("Bike type is: $type")
    }
}