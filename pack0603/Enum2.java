
import java.util.Scanner;
import java.util.Random;
enum Janken{
    // enum定数とコンストラクタ呼び出し
    ROCK("グー",0),
    SCISSORS("チョキ",1),
    PAPER("パー",2);
    // フィールド
    private String name;
    private int num;
    // コンストラクタ　※enumはインスタンスを外部から生成できないため、暗黙でprivateになる
    private Janken(String name,int num){
        this.name = name;
        this.num = num;
    } 
    // ゲッターメソッド
    String getName(){
        return this.name;
    }
    int getNum(){
        return this.num;
    }
    // 勝敗決定
    void toWin(Janken comHand){
        int result = (this.getNum() - comHand.getNum() + 3) % 3;
        System.out.printf("あなた：%s / 相手：%s -> ",this.getName(),comHand.getName());
        switch(result){
            case 0 -> System.out.println("あいこ");
            case 1 -> System.out.println("負け");
            case 2 -> System.out.println("勝ち");
        }
    }
    @Override
    public String toString(){
        return this.name;
    } 
}
class Enum2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Shift_JIS");
        Random rnd = new Random();
        // プレイヤーの手を保存する用
        Janken yourHand = null;
        System.out.print("じゃんけん、、、：");
        String input = sc.nextLine();
        // 入力値がenum定数のフィールドと一致したら格納する
        Janken[] hands = Janken.values();
        for(Janken hand : hands){
            System.out.println("hand.getName()"+ hand.getName());
            System.out.println("グー"+input);
            if(input.equals(hand.getName())){
                yourHand = hand;
            }
        }
        // 相手の手を選択する用
        System.out.print("ぽん！");
        // 相手の手をランダムに選んで１つ格納する
        Janken comHand = hands[rnd.nextInt(3)];
        System.out.println("comHand"+ comHand);
        System.out.println("yourHand" + yourHand);
        // 勝敗決定（入力値がおかしい場合を例外処理）
        try{
            yourHand.toWin(comHand);
        }catch(NullPointerException e){
            System.out.println("そんな手はありません！");
        }
    }
}
