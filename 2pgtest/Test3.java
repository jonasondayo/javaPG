public class Test3 {
    public static void main(String[] args) {
        String[] subjects = {"国語", "数学", "理科", "社会", "英語"};
        int [] scores = {84,46,72,53,98,69};
        double sum=0;
        double ave;
        for (int i=0; i<subjects.length;i++) {
            sum += scores[i];
        }
        System.out.println();
        ave = sum / scores.length;
        for (int i=0;i<subjects.length;i++) {
            System.out.println(subjects[i] +"の点数は"+ scores[i] + "点です。");
        }
        System.out.println("合計は" + (int)sum + "点です。");
        System.out.println("平均は" + ave + "点です。");
    
    }
}
