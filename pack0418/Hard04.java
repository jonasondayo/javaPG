
import java.util.Scanner;

class Hard04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1辺の長さを入力:");
        int x = sc.nextInt();
        for (int $i=1; $i<=x; $i++) {
            for (int $z=1; $z<=x; $z++) {
                if ($z == $i || $z == x - $i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

