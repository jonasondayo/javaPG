
public class SMSNotification implements Notification{
    private String phoneNumber;

    SMSNotification(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendNotification(String message) {
        System.out.printf("Sending phoneNumber to (%s)\n\t>%s\n",this.phoneNumber,message);
    }
}
