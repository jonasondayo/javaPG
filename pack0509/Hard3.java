import java.util.Scanner;

public class Hard3 {
    public static void main(String[] args) {
        int [] scores = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<10;i++) {
            System.out.print("数字を入力してください:");
            int score = sc.nextInt();
            scores[scores.length - i - 1] = score;
        }
        for (int i=0;i<scores.length; i++) {
            System.out.println(scores[i]);
        }
    }
}
