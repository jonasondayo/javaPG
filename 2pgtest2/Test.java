import java.util.*;

public class Test {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        String[] mothStrings = {"January", "Februry", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int [] order = new int[12];
        for (int i = 0; i < order.length; i++) {
            order[i] = i + 1;
        }
        for (int i = 0; i < order.length; i++) {
            //要素番号と乱数の位置を入れ替える
            int index = rnd.nextInt(order.length);
            int temp = order[i];
            order[i] = order[index];
            order[index] = temp;
        }
        System.out.println("英語の月名を入力してください。");
        int correct = 0;
        for (int i = 0; i < mothStrings.length; i++) {
            int month = order[i];
            System.out.printf("%2d 月", month);
            String answer = sc.next();
            if (answer.equals(mothStrings[month -1])) {
                System.out.println("正解です。");
                correct++;
            } else {
                System.out.println("違います。");
            }
        }
        System.out.printf("%2d 問正解でした。", correct);
    }
}
