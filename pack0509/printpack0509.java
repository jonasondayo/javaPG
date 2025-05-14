
public class Normal03 {
    public static void main(String[] args) {
        String [] subjects = {"国語", "算数", "理科", "社会", "英語", "体育"};
        int [] scores = {84,46,72,53,98,69};
        for (int i=0;i<subjects.length;i++) {
            System.out.println(subjects[i] + " " + scores[i]);
        }
    }
}


public class Normal04 {
    public static void main(String[] args) {
        int[] nums = {11, 36, 83, 26};
        int sum = 0;
        for (int num: nums) {
            sum+=num;
        }
        int [] results = new int[nums.length + 1];
        results[0] = sum;
        for (int i=0;i<nums.length;i++) {
            results[i+1] = nums[i];
        }
        for (int i=0;i<results.length;i++) {
            System.out.println(results[i]);
        }

    }
}


public class Normal05 {
    public static void main(String[] args) {
        int[] array01 = {1,2,3,4,5};
        int[] array02 = {6,7,8,9,10};

        int total = 0;
        for (int num: array01) {
            total+= num;
        }
        for (int i: array02) {
            total+=i;
        }
        System.out.println("Normal05 total:"+total);
    }
}





import java.util.Scanner;

public class Hard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] subjects = {"国語", "数学", "理科", "社会", "英語"};
        int [] scores = new int[subjects.length];
        int sum=0;
        for (int i=0; i<subjects.length;i++) {
            System.out.print(subjects[i] + "の点数:");
            int score = sc.nextInt();
            scores[i] = score;
            sum += score; 
        }
        System.out.println();
        int ave = sum / scores.length;
        for (int i=0;i<subjects.length;i++) {
            System.out.println(subjects[i] +"の点数は"+ scores[i] + "点です。");
        }
        System.out.println("合計は" + sum + "です。");
        System.out.println("平均は" + ave + "点です。");
    }
}

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








import java.util.Scanner;

public class Hard3 {
    public static void main(String[] args) {
        int [] scores = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<10;i++) {
            System.out.print("数字を入力してください:");
            int score = sc.nextInt();
            scores[i] = score;
        }
        for (int i=0;i<scores.length; i++) {
            System.out.println(scores[scores.length - i - 1]);
        }
    }
}


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

