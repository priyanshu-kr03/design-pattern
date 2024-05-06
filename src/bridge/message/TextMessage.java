package bridge.message;

import bridge.sender.NotificationSender;

public class TextMessage extends Message{

    public TextMessage(NotificationSender notificationSender) {
        super(notificationSender);
    }

    @Override
    void sendMessage() {
        notificationSender.sendNotification();
    }
}
