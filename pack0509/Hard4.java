import java.util.Scanner;

public class Hard4 {
    public static void main(String[] args) {
        int [] scores = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<10;i++) {
            System.out.print("数字を入力してください:");
            int score = sc.nextInt();
            scores[i] = score;
        }
        System.out.println("偶数を表示します。");
        for (int i=0;i<scores.length; i++) {
            if (scores[i] % 2==0) {
                System.out.println(scores[i]);
            }
        }
        System.out.println("奇数を表示します。");
        for (int i=0;i<scores.length; i++) {
            if (scores[i] % 2==1) {
                System.out.println(scores[i]);
            }
        }
    }
}
