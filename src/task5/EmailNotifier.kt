package task5

class EmailNotifier : Notifier {
    override fun sendNotification(message: String) {
        println("EmailNotifier sendNotification: $message")
    }

}