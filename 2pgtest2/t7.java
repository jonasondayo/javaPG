import java.util.*;

public class t7 {
    public static void main(String[] args) {
        int [] [] tables = new int[7][5];
        for (int i=0; i<tables.length;i++){
            for (int j=0;j<tables[i].length;j++){
                tables[i][j] = (i+2) + (2*j+1);
            }
        }
        int [] a = {2, 3, 4, 5, 6, 7,8}; int [] b = {1,3,5,7,9};
        for (int i=0; i<tables.length;i++){
            for (int j=0;j<tables[i].length;j++){
                tables[i][j] = a[i] + b[j];
            }
        }
        for (int [] floor: tables) {
            for (int room: floor) {
                System.out.printf("%2d ", room);
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.print("input number: ");
            number = sc.nextInt();
        } while (number % 2 ==0);
        System.out.print("Odd number!");
    }
}   
