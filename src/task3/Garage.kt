package task3

class Garage {
    val garage = mutableListOf<Vehicle>()

    fun startAll() {
        garage.forEach { it.start() }
    }

    fun stopAll() {
        garage.forEach { it.stop() }
    }

    fun displayAll() {
        garage.forEach { it.displayInfo() }
    }
}