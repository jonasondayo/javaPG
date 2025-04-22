
import java.util.Scanner;

class Hard02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1辺の長さを入力:");
        int x = sc.nextInt();
        for (int $i=1; $i<=x; $i++) {
            for (int $k=1; $k<= $i -1; $k++) {
                System.out.print(" ");
            }
            for (int $z=0; $z<= (x - $i) * 2; $z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
