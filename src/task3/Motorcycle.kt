package task3

class Motorcycle(val engineCapacity: Int) : Vehicle {
    override fun start() {
        println("Motorcycle is starting...")
    }

    override fun stop() {
        println("Motorcycle is stopping...")
    }

    override fun displayInfo() {
        println("Motorcycle engine capacity is: $engineCapacity")
    }
}