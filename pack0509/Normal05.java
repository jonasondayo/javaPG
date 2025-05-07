
public class Normal05 {
    public static void main(String[] args) {
        int[] array01 = {1,2,3,4,5};
        int[] array02 = {6,7,8,9,10};

        int total = 0;
        for (int num: array01) {
            total+= num;
        }
        for (int i: array02) {
            total+=i;
        }
        System.out.println("Normal05 total:"+total);
    }
}
