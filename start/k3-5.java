import java.util.Scanner;
import java.util.Random;

public class k35 {
    public static void main(String[] args) {
        System.out.print("1:検索:2:登録:3:削除:4:変更>");
        int selectd = new Scanner(System.in).nextInt();
        switch (selectd) {
            case 1 -> {
                System.out.println("検索する");
            }
            case 2 -> {
                System.out.println("登録する");
            }
            case 3 -> {
                System.out.println("削除する");
            }
            case 4 -> {
                System.out.println("変更する");
            }
        }

    }   

}