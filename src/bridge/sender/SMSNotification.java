package bridge.sender;

public class SMSNotification implements NotificationSender{
    @Override
    public void sendNotification() {
        System.out.println("Sending an SMS");
    }
}
