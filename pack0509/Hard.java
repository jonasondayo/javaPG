import java.util.Scanner;

public class Hard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] subjects = {"国語", "数学", "理科", "社会", "英語"};
        int [] scores = new int[subjects.length];
        double sum=0;
        for (int i=0; i<subjects.length;i++) {
            System.out.print(subjects[i] + "の点数:");
            int score = sc.nextInt();
            scores[i] = score;
            sum += score; 
        }
        System.out.println();
        double ave = sum / scores.length;
        for (int i=0;i<subjects.length;i++) {
            System.out.println(subjects[i] +"の点数は"+ scores[i] + "点です。");
        }
        System.out.println("合計は" + (int)sum + "点です。");
        System.out.println("平均は" + ave + "点です。");
    }
}
