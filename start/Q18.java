class TextChain {
    String separator;
    TextChain() {
        separator= ":";
    }
}

class MyTextChain extends TextChain {
    MyTextChain(String s) {
        separator = s;
    }
    
}

public class  Q18 {
    public static void main(String[] args) {
        // 引数が必要
        MyTextChain obj = new MyTextChain("AA:BB");
        System.out.println(obj.separator);
    }
    
}
