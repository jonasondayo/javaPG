import java.util.Scanner;

public class Nightmare02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("アンケートに回答する人数は？:");
        double mem = sc.nextInt();
        int [] ans = new int [5];
        for (int i=0; i<ans.length;i++) {
            ans[i] =0;
        }
        int sum =0;
        int nosum = 0;
        for (int i=0; i<mem;i++) {
            System.out.printf("%d人目:", i+1);
            int input = sc.nextInt();
            
            if (1<= input && input<=5) {
                ans[input - 1] +=1;
                sum+=1;
            } else {
                nosum +=1;
            }
        }
        System.out.println("集計結果です。");
        double yuu = (sum / mem) * 100;
        for (int i=0; i<5;i++) {
            System.out.printf("評価%d : %d / ", i+1, ans[i]);
            
            double k = (ans[i] / mem) * 100;
            System.out.print(k + "%\n");
        }
        double noyuu = (nosum /mem) * 100;
        System.out.print("無効:" + nosum + " / " + noyuu + "%\n");
        System.out.println("回答者:" + (int)mem + "名 / 有効票：" + yuu + "%");
    }
}
