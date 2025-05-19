// 2PG配列とfor文の配列の答え
public class Normal03 {
    public static void main(String[] args) {
        // 教科の配列
        String [] subjects = {"国語", "算数", "理科", "社会", "英語", "体育"};
        // 数字の配列
        int [] scores = {84,46,72,53,98,69};
        // 教科と数字の表示 キーが0から始まり、配列の数だけループして表示する
        for (int i=0;i<subjects.length;i++) {
            System.out.println(subjects[i] + " " + scores[i]);
        }
    }
}






public class Normal04 {
    public static void main(String[] args) {
        int[] nums = {11, 36, 83, 26};
        // sum はforの外で表示する（forの中で宣言したものはforの中でしか使えないため）
        int sum = 0;
        for (int num: nums) {
            sum+=num;
        }
        //元の配列より1つ多い配列を作成する
        int [] results = new int[nums.length + 1];
        // 配列の先頭に合計値を入れる
        results[0] = sum;
        // sumが入った分の1つずらして、入れる
        for (int i=0;i<nums.length;i++) {
            results[i+1] = nums[i];
        }
        // 完成した配列を表示
        for (int i=0;i<results.length;i++) {
            System.out.println(results[i]);
        }

    }
}








public class Normal05 {
    public static void main(String[] args) {
        int[] array01 = {1,2,3,4,5};
        int[] array02 = {6,7,8,9,10};
        // 合計値を入れる変数を宣言
        int total = 0;
        // array01の配列の合計値
        for (int num: array01) {
            total+= num;
        }
        // array01の合計値にarray02をすべて足して２つの配列の合計値にする
        for (int i: array02) {
            total+=i;
        }
        // 表示する
        System.out.println("Normal05 total:"+total);
    }
}

import java.util.Scanner;

public class Hard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 教科
        String[] subjects = {"国語", "数学", "理科", "社会", "英語"};
        // 教科の数だけ得点を収納する配列を作成する
        int [] scores = new int[subjects.length];
        // 合計値のための変数sumをfor文の外で作成する
        // 平均で割り算するときにも利用するためdoubleで宣言する方が処理的には良い
        // intでも良い。平均を求める時に(double)のキャストする必要がある
        int sum = 0;
        // 教科の配列の数だけ繰り返す
        for (int i=0; i<subjects.length;i++) {
            //　教科を1つずつ表示
            System.out.print(subjects[i] + "の点数:");
            // 数字を入力する
            int score = sc.nextInt();
            scores[i] = score;
            // すべて足して合計値を出す
            sum += score; 
        }
        System.out.println();
        // 平均値を計算する 
        // sum をintで宣言した場合はdoubleでキャストをする
        // int→doubleのキャストよりdouble→intのキャストの方が負荷は小さい
        // intでsumをしてdoubleでキャスト読みやすさや書きやすさが少々良い
        double ave = (double) sum / scores.length;
        // ２つの配列からそれぞれ各教科と点数を表示する。
        for (int i=0;i<subjects.length;i++) {
            System.out.println(subjects[i] +"の点数は"+ scores[i] + "点です。");
        }
        // sumをintでキャストする。大きい型から小さい型への変換するのは良いが逆は極力避ける
        System.out.println("合計は" + sum + "です。");
        System.out.println("平均は" + ave + "点です。");
    }
}

import java.util.Scanner;

public class Hard2 {
    public static void main(String[] args) {
        // 10個の数字が入る配列の箱を作成する
        int [] scores = new int[10];
        // 入力をnew Scanner(System.in).next を省略して書くための変数
        Scanner sc = new Scanner(System.in);
        // 10回繰り返す処理
        for (int i=0; i<10;i++) {
            System.out.print("数字を入力してください:");
            // 数字を入力する
            int score = sc.nextInt();
            // 入力した二倍した数値を配列に入れる
            scores[i] = score*2;
        }
        // 作成した配列を表示する 入力値の2倍の値であることを確認
        for (int score: scores) {
            System.out.println(score);
        }
    }
}

import java.util.Scanner;

public class Hard3 {
    public static void main(String[] args) {
        // 10個の数字が入る配列の箱を作成する
        int [] scores = new int[10];
        // 入力をnew Scanner(System.in).next を省略して書くための変数
        Scanner sc = new Scanner(System.in);
        // １０回繰り返す処理
        for (int i=0; i<10;i++) {
            System.out.print("数字を入力してください:");
            int score = sc.nextInt();
            // 配列を一番後ろから入れると逆順の配列を作成する
            scores[scores.length - i - 1] = score;
        }
        // 作成した配列を前から表示する
        for (int i=0;i<scores.length; i++) {
            System.out.println(scores[i];
        }



        // 以下でも問題ない
        for (int i=0; i<10;i++) {
            System.out.print("数字を入力してください:");
            int score = sc.nextInt();
            // 配列を入力順に入れる
            scores[i] = score;
        }
        // 作成した配列を後ろから表示する
        for (int i=1;i<=scores.length; i++) {
            System.out.println(scores.length - i);
        }
    }
}


import java.util.Scanner;

public class Hard4 {
    public static void main(String[] args) {
        // 配列を作成する
        int [] scores = new int[10];
        Scanner sc = new Scanner(System.in);
        // 10回入力した数字の配列を作成する
        for (int i=0; i<10;i++) {
            System.out.print("数字を入力してください:");
            int score = sc.nextInt();
            scores[i] = score;
        }

        System.out.println("偶数を表示します。");
        for (int i=0;i<scores.length; i++) {
            // 偶数かどうかを判定して表示
            if (scores[i] % 2==0) {
                System.out.println(scores[i]);
            }
        }
        System.out.println("奇数を表示します。");
        for (int i=0;i<scores.length; i++) {
            // 奇数かどうかを判定して表示
            if (scores[i] % 2==1) {
                System.out.println(scores[i]);
            }
        }
    }
}






import java.util.Scanner;

public class Nightmare01 {
    public static void main(String[] args) {
        // 10回数字を入力して配列に入れる
        int [] scores = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<10;i++) {
            System.out.print("数字を入力してください:");
            int score = sc.nextInt();
            scores[i] = score;
        }
        // 入力した数の*を表示する
        for (int i=0; i<10;i++) {
            // array[i]の形で表示
            System.out.printf("array[%d]:", i);
            // 配列にある数値の数*を表示する
            for (int z=1; z<=scores[i];z++) {
                System.out.print("*");
            }
            System.out.println();
        } 
    }
}

