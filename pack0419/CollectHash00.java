import java.util.*;

class CollectHash00 {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        hash.addAll(Arrays.asList(1,5,3,4,7,9,6,2,8));
        System.out.println("Easy01" + hash);

        hash.remove(9);
        System.out.println("Easy02" + hash);
        System.out.println("hashsize()" + hash.size());        
        Integer [] HashArray = new Integer[hash.size()];
        hash.toArray(hashArray);
        System.out.println("Easy03" + Arrays.toString(hashArray));
    }
}
