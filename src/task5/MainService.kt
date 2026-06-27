package task5

fun main() {
    val notifier: Notifier = EmailNotifier()
    val push = PushNotifier()
    val sms = SMSNotifier()

    val service = NotificationService(notifier)

    service.sendSomething("hello")
    service.notifications = push
    service.sendSomething("hello")

}