import java.util.Scanner;

class Normal02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1辺の長さを入力:");
        int x = sc.nextInt();
        for (int $i=1; $i<=x; $i++) {
            for (int $z=1; $z<=x; $z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}