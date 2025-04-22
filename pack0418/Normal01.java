
class Normal01 {
    public static void main(String[] args) {
        for (int $k=1; $k<=9;$k++) {
            for (int $i=1; $i<=9; $i++) {
                int $ans = $i * $k;
                System.out.printf("%2d ", $ans);
            }
            System.out.println();
        }
    }
}
