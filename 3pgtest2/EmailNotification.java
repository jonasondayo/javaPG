class EmailNotification implements Notification {
    private String emailAddress;

    EmailNotification(String emailAddres) {
        this.emailAddress = emailAddres;
    }

    @Override
    public void sendNotification(String message) {
        System.out.printf("Sending email to (%s)\n\t>%s\n",this.emailAddress,message);
    }
}
