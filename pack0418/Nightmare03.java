

import java.util.Scanner;

class Nightmare03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1辺の長さを入力:");
        int x = sc.nextInt();
        for (int $i=1; $i<=x; $i++) {
            for (int $k=0; $k<= x - $i; $k++) {
                if ($k == x - $i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int $z=2; $z<= $i * 2 - 1; $z++) {
                if ($z == $i *2 -1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int $i=2; $i<=x; $i++) {
            for (int $k=0; $k<= $i -1; $k++) {
                if ($k == $i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int $z=0; $z<= (x - $i) * 2; $z++) {
                if ($z == (x - $i) * 2 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}