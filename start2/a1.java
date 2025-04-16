
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String [] array = {"eraser", "erase", "dreamer", "dream"};
        String [] barray = {"erase", "dream","dreamer","eraser"};
            String t = s;
            for (int i=0;i<array.length;i++) {
                if (s.indexOf(array[i]) != -1) {
                    s = s.replace(array[i], "");
                }
                
            }
            for (int i=0;i<barray.length;i++) {
                if (t.indexOf(barray[i]) != -1) {
                    t = t.replace(barray[i], "");
                }
                
            }

        if (s.length() == 0 || t.length() == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }   

}