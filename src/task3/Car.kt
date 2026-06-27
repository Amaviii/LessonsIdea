package task3

class Car(val brand: String) : Vehicle {

    override fun start() {
        println("Car is starting...")
    }

    override fun stop() {
        println("Car is stopping...")
    }

    override fun displayInfo() {
        println("Car with brand: $brand")
    }
}