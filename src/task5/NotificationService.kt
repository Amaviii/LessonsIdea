package task5

class NotificationService(var notifications: Notifier) {
    fun sendSomething(message: String) {
        notifications.sendNotification(message)
    }
}