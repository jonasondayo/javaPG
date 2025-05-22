public class Test2 {
    public static void main(String[] args) {
        int [] array01 = {1,5,3,8,9};
        int [] array02 = {2,9,4,1,15};
        int [] total = new int [array01.length];

        for (int i=0;i< total.length;i++) {
            total[i] = array01[i] + array02[array02.length -1 -i];
            System.out.printf("%2d,", total[i]);
        }
        System.out.printf("%d\n", total[total.length -1]);
    }
    
}
