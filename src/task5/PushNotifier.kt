package task5

class PushNotifier : Notifier {
    override fun sendNotification(message: String) {
        println("PushNotifier sendNotification: $message")
    }
}