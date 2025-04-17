
// https://www.sejuku.net/blog/22006

import java.util.Scanner;

public class Join {
	public static void main(String[] args) {
		// ThreadTestクラスのインスタンス化
		ThreadTest tt = new ThreadTest();

		// ThreadTestクラスの処理を実行
		tt.start();
		System.out.println("ThreadTestクラスの処理を開始しました");

		// ThreadTestクラスの処理が終了するまで待機の指示
		try {
			tt.join();
		} catch (InterruptedException e) {
			// 例外処理
			e.printStackTrace();
		}

		// Mainクラスの処理を実行
		System.out.println("ThreadTestクラスの処理が終了しました");
		System.out.println("Mainクラスの処理を開始します");
		for (int i = 0; i < 5; i++) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			System.out.println((i + 1) + "回目の処理です");
			System.out.println(num);
		}
	}

}
// Threadクラスを拡張したThreadTestクラスを作成
public class ThreadTest extends Thread{
	public void run(){
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1); //　1秒待機
				System.out.println((i + 1) + "秒経過");
			} catch (InterruptedException e) {
				// 例外処理
				e.printStackTrace();
			}
		}
	}
}