import java.util.Scanner;

public class Hard2 {
    public static void main(String[] args) {
        int [] scores = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<10;i++) {
            System.out.print("数字を入力してください:");
            int score = sc.nextInt();
            scores[i] = score*2;
        }
        for (int score: scores) {
            System.out.println(score);
        }
    }
}
