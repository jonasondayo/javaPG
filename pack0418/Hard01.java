
import java.util.Scanner;

class Hard01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1辺の長さを入力:");
        int x = sc.nextInt();
        for (int $i=1; $i<=x; $i++) {
            for (int $k=1; $k<= x - $i; $k++) {
                System.out.print(" ");
            }
            for (int $z=1; $z<= $i * 2 - 1; $z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}