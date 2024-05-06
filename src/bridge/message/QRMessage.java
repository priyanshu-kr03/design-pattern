package bridge.message;

import bridge.sender.NotificationSender;

public class QRMessage extends Message {
    public QRMessage(NotificationSender notificationSender) {
        super(notificationSender);
        System.out.println("This is QR message");
    }

    @Override
    public void sendMessage() {
        notificationSender.sendNotification();
    }
}
