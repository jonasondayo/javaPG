import java.util.Scanner;

public class Nightmare03 {
    public static void main(String[] args) {
        int [] validNumbers = {134324, 454323, 814823, 421914, 404347, 134552, 182276};
        Scanner sc = new Scanner(System.in);
        System.out.println("ライセンス番号を入力してください。");
        int num = sc.nextInt();

        if (validSearch(num, validNumbers)) {
            System.out.println("正規製品です。");
        } else {
            System.out.println("違法なライセンスです。");
        }
    }
    public static boolean validSearch(int inp, int[] array) {
        boolean res = false;
        for (int a : array) {
            if (a == inp) {
                res = true;
            }
        }
        return res;
    }
}
