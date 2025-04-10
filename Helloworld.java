
import java.util.Scanner;
import java.util.Random;

public class HelloWorld {

  public static void main(String[] args) {
    System.out.println("ようこそ占いの館へ");
    System.out.println("あなたの名前を入力してください>");
    String sc = new Scanner(System.in).next();
    System.out.println("あなたの年齢を入力してください>");
    int age = new Scanner(System.in).nextInt();
    System.out.println("占い結果が出ました!");
    int number = new Random().nextInt(3) + 1; 
    System.out.println(age + "歳の" + sc + "さんの運気番号は" + number);

  }
}