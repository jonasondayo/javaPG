
import java.util.Scanner;

class Hard02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1辺の長さを入力:");
        int x = sc.nextInt();
        for (int $i=1; $i<=x; $i++) {
            if ($i==1 || $i==x) {
                for (int $z=1; $z<=x; $z++) {
                    System.out.print("*");
                }
            } else {
                for (int $g=1; $g<=x; $g++) {
                    if ($g == 1 || $g == x) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}

