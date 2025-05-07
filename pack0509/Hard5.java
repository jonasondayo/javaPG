import java.util.Scanner;

public class Hard5 {
    public static void main(String[] args) {
        int [] scores = new int[10];
        int [] gScores = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<10;i++) {
            System.out.print("数字を入力してください:");
            int score = sc.nextInt();
            scores[i] = score;
            gScores[gScores.length - 1 - i] = score;
        }
        System.out.println("順序通りの配列の表示");
        for (int i=0;i<scores.length; i++) {
            System.out.println(scores[i]);
        }
        System.out.println("逆順の配列の表示");
        for (int i=0;i<gScores.length; i++) {
            System.out.println(gScores[i]);
        }
    }
}
