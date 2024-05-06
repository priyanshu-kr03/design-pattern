package bridge.sender;

public class EmailNotifcation implements NotificationSender{
    @Override
    public void sendNotification() {
        System.out.println("Sending an email");
    }
}
