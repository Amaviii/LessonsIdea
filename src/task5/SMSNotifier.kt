package task5

class SMSNotifier : Notifier {
    override fun sendNotification(message: String) {
        println("SMSNotifier sendNotification: $message")
    }
}