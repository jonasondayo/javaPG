import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 400 % a;
        int c = 400 / a;
        if (b != 0) {
            System.out.println(-1);
        } else {
            System.out.println(c);
        }
    
    }   

}