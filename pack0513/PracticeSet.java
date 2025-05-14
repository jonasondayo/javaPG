import java.util.*;

public class PracticeSet {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>(Arrays.asList("Apple", "Banana", "Orange", "Grapes", "Kiwi", "Apple"));
        System.out.println(fruits);
        HashSet<String> addFruits = new HashSet<>(Arrays.asList("Grapefruit", "Lime", "Strawberries", "Kiwi", "Watermelon"));
        HashSet<String> newFruits = new HashSet<>(fruits);
        newFruits.addAll(addFruits);
        System.out.println("新しいセットに更新");
        System.out.println(newFruits);
        TreeSet<String> sortFruits = new TreeSet<>(fruits);
        System.out.println("整列した配列");
        System.out.println(sortFruits);

        LinkedHashSet<String> linkedFruits = new LinkedHashSet<>(fruits);
        linkedFruits.add("Melon");
        linkedFruits.add("BlueBerry");
        linkedFruits.add("Yuzu");
        System.out.println("順序の保持する");
        System.out.println(linkedFruits);
        System.out.println("６文字以上の果実");
        for (String fruit: linkedFruits) {
            if (fruit.length() >=6) {
                System.out.println(fruit);
            }
        }

        // newFruits.stream().filter(f -> f.length()>=6).forEach(f -> System.out.printf("%s", f));
        // System.out.println();
    }
}
