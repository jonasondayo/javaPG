import java.util.*;

class CollectLinkedHash00 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> hash = new LinkedHashSet<>();
        hash.addAll(Arrays.asList(1,5,3,4,2,7,9,6,2,8, 8));
        System.out.println("LinkedHash" + hash);

        Random rnd = new Random();
        LinkedHashSet<Integer> lhash = new LinkedHashSet<>();
        while (lhash.size() < 10) {
            lhash.add(rnd.nextInt(10));
        }
        System.out.println(lhash);

        Integer[] lhashArray = new Integer[lhash.size()];
        lhash.toArray(lhashArray);
        System.out.println(Arrays.toString(lhashArray));
    }
}

