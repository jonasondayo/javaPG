import java.util.Scanner;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        String food = "カレー";
        System.out.println("こんにちは");
        int isHungry = new Scanner(System.in).nextInt();
        if (isHungry == 0) {
            System.out.println("お腹がいっぱいです");
        } else {
            System.out.println("はらぺこです");
        } 
        if (isHungry == 1) {
            System.out.println(food + "をいただきます");
        }
        System.out.println("ごちそうさまでした");

    }   

}