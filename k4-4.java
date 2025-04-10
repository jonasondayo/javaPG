import java.util.*;
public class k44 {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 9};
        System.out.println("１桁の数字を入力してください");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
    
        boolean answer = false;
        for (int value: numbers) {
            if (value == input) {
                answer = true;
                break;
            }
        }
        if (answer) {
            System.out.println("当たり!");
        } else {
            System.out.println("ハズレ");
        }

    }   

}