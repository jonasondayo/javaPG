
class Normal01 {
    public static void main(String[] args) {
        for (int $k=1; $k<=9;$k++) {
            for (int $i=1; $i<=9; $i++) {
                int $ans = $i * $k;
                System.out.print($ans+ " ");
                if (String.valueOf($ans).length() == 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
