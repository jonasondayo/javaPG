public class Main2 {
    public static void main(String[] args) {
        EmailNotification e_notify = new EmailNotification("test@yamagaku.com");
        SMSNotification s_notify = new SMSNotification("080-1234-4567");
        // 単体での送信実験
        System.out.println("[各送信手段による送信テスト]");
        e_notify.sendNotification("test from E-mail");
        s_notify.sendNotification("test from SMS");
        System.out.println();

        // 一斉送信実験（ラムダ式を使用）
        System.out.println("[緊急時用一斉送信テスト]");
        Notification broadCast = msg -> System.out.printf("Sending BroadCast\n\t>%s\n", msg);
        broadCast.sendNotification("test from Rambda");
        System.out.println();

        // 全手段への一斉送信実験
        System.out.println("[全送信手段への送信]");
        Notification[] notifies = new Notification[3];
        notifies[0] = e_notify; 
        notifies[1] = s_notify;
        notifies[2] = broadCast; 

        for(Notification notify : notifies){
            notify.sendNotification("Polymorphism_Notification");
        }
    }
    
}
