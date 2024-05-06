package bridge.message;

import bridge.sender.NotificationSender;

public abstract class Message {
    NotificationSender notificationSender;

    public Message(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    abstract void sendMessage();
}
