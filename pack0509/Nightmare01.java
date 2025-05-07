import java.util.Scanner;

public class Nightmare01 {
    public static void main(String[] args) {
        int [] scores = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<10;i++) {
            System.out.print("数字を入力してください:");
            int score = sc.nextInt();
            scores[i] = score;
        }
        for (int i=0; i<10;i++) {
            System.out.printf("array[%d]:", i);
            for (int z=1; z<=scores[i];z++) {
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}
