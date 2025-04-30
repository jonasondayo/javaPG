import java.util.*;

class CollectArray01 {
    public static void main(String[] args) {
        ArrayList<Integer> numArray = new ArrayList<>();
        numArray.addAll(Arrays.asList(1,4,2,5,7,3,6));
        System.out.println("Normal01:" + numArray);

        int max = 0;
        int sum = 0;
        for (int num: numArray) {
            if (max <= num) {
                max = num;
            }
             sum += num;
        }
        System.out.println("Nol02: 最大値は" + max + "である");
        System.out.println("Nol01: 合計は" + sum + "である");
    }
}