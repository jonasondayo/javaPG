import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);
        // 問題用配列
        ArrayList<String> key = new ArrayList<>(Arrays.asList(
                "りんご", "バナナ", "ミカン", "ぶどう", "キウィ"));
        // 解答用配列
        ArrayList<String> value = new ArrayList<>(Arrays.asList(
                "apple", "banana", "orange", "grapes", "kiwi"));
        // 単語帳Mapを作成
        Map<String, String> wordBook = new LinkedHashMap<>();
        // 問題の出題順をランダムに決定し、単語帳へ登録する
        int[] order = new int[key.size()];
        for (int i = 0; i < order.length; i++) {
            order[i] = i;
        }
        for (int i = 0; i < order.length; i++) {
            //要素番号と乱数の位置を入れ替える
            int index = rnd.nextInt(key.size());
            int temp = order[i];
            order[i] = order[index];
            order[index] = temp;
        }
        for (int index : order) {
            wordBook.put(key.get(index), value.get(index));
        }
        // 解答と正誤を格納するMap
        Map<String, Boolean> userAnswers = new LinkedHashMap<>();
        // 問題の出題
        int num = 1;
        for (String question : wordBook.keySet()) {
            System.out.printf("問題%2d:%sを英語で答えよ -> ", num, question);
            String response = sc.nextLine();
            Boolean answer = false;
            if (response.equals(wordBook.get(question))) {
                answer = true;
            }
            userAnswers.put(response, answer);
            num++;
        }
        // 正解数をカウント
        long count = 0;
        for (boolean a : userAnswers.values()) {
            if (a) count++;
        }
        System.out.printf("正解数は%2dです。\n", count);

        //結果をCSV形式で出力する
        System.out.printf("問題,正解,解答,正誤\n");

        //keySetを配列に変換する
        String[] wbArray = wordBook.keySet().toArray(new String[0]);
        String[] uaArray = userAnswers.keySet().toArray(new String[0]);

        for (int i = 0; i < wbArray.length; i++) {
            System.out.printf("%s,%s,%s,%b\n",
                    wbArray[i],
                    wordBook.get(wbArray[i]),
                    uaArray[i],
                    userAnswers.get(uaArray[i]));
        }
        sc.close();
    }
}
