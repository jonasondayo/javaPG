import java.util.Scanner;

public class Nightmare02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("アンケートに回答する人数は？:");
        // 数字を入力する
        int mem = sc.nextInt();
        // 5段階評価の数を数えるための配列
        int [] ans = new int [5];
        // 1~5段階評価の数の初期値は0
        for (int i=0; i<ans.length;i++) {
            ans[i] =0;
        }
        // 有効票の数を計算する変数sum 今回はintで宣言
        // doubleで宣言した方が良さそうである　doble sum = 0;
        int sum =0;
        // 無効票の数をnosum 今回はintで宣言
        // doubleで宣言した方が良さそうではある　dobule nosum = 0;
        int nosum = 0;
        for (int i=0; i<mem;i++) {
            System.out.printf("%d人目:", i+1);
            // 評価の数値を入力する
            int input = sc.nextInt();
            // 1~5の場合は有効票にsumを１増やす
            if (1<= input && input<=5) {
                // 入力した数字の1引いた数(配列は0から始まるため)
                // の添え字（キー）の配列の値を１足す
                // 5を入力した場合
                ans[input - 1] +=1;
                // 有効票の数を１ずつ増やす
                sum+=1;
            } else {
                // 無効票はnosumに１ずつ増やす
                nosum +=1;
            }
        }
        System.out.println("集計結果です。");

        // intからdouble 今回はintで宣言してあるためdoubleでキャストする必要がある。
        // 有効票の計算する
        double yuu = (double)sum / mem * 100;
        // 無効票の計算する
        double noyuu =  (double)nosum /mem * 100;
        // 評価から集計結果を表示する
        for (int i=0; i<5;i++) {
            // 評価の数を表示する
            System.out.printf("評価%d : %d / ", i+1, ans[i]);
            // 各票数が総評数の何パーセントかを計算して表示する
            double k = (double)(ans[i] / mem) * 100;
            System.out.print(k + "%\n");
        }
        // 無効表の数とパーセントを表示する
        System.out.print("無効:" + nosum + " / " + noyuu + "%\n");
        // 回答者数と有効票数を表示する
        System.out.println("回答者:" + mem + "名 / 有効票：" + yuu + "%");
    }
}
