package task3

fun main() {
    val car = Car("BMW")
    val bike = Bike("Street")
    val motorcycle = Motorcycle(120)

    val garage = Garage()
    garage.garage.add(car)
    garage.garage.add(bike)
    garage.garage.add(motorcycle)
    garage.startAll()
    garage.stopAll()
    garage.displayAll()
}