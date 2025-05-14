
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class PracticeArray {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange", "Grapes", "Kiwi"));
        System.out.print("初期状態の表示\t\t");
        System.out.println(fruits);
        fruits.add(0, "Cherry");
        System.out.println(fruits);
        if (fruits.contains("Grapes")) {
            fruits.set(fruits.indexOf("Grapes"), "Lemon");
        }
        System.out.println("Lemonに変更");
        System.out.println(fruits);
        for (int i=0;i<fruits.size();i++){
            if (fruits.get(i).length()<6) {
                System.out.println(fruits.get(i)+"を消します");
                fruits.remove(i);
                i--;
            }
        }
        System.out.println(fruits);

        // Iterator<String> iterator = fruits.iterator();
        // while (iterator.hasNext()) {
        //     String f = iterator.next();
        //     if (f.length()<6) {
        //         iterator.remove();
        //     }
        // }
        // System.out.println(fruits);


    }
}
