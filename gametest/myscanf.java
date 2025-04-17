// https://www.upken.jp/kb/java_wait_console.html
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class myscanf{
  public static void main(String args[]){
    String str = null;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try{
      str = br.readLine();
    }catch(IOException e){
      System.out.println("入力エラー:" + e.getMessage());
    }
    System.out.println("input: '" + str + "'");
    System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    for (int i= 0;i<10;i++) {
        System.out.println(i);
    }
  }
}