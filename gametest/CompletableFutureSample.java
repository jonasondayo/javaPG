import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureSample {
    // 非同期処理をメソッドに定義する
    private static String prinlnAsync(String str) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(str);
        return str + "completed!";
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // 複数の非同期処理をListに格納する
        List<CompletableFuture<String>> futureList = Arrays.asList(
            CompletableFuture.supplyAsync(() -> prinlnAsync("async1")),
            CompletableFuture.supplyAsync(() -> prinlnAsync("async2")),
            CompletableFuture.supplyAsync(() -> prinlnAsync("async3"))
        );
        // 全ての非同期処理をCompletableFuture<Void>にまとめる
        CompletableFuture<Void> future = CompletableFuture.allOf(futureList.toArray(new CompletableFuture[futureList.size()]));
        // 全ての非同期処理が完了した際の処理を記述する
        future.whenComplete((result, e) -> {
            // 例外のハンドリング
            if (e != null) {
                System.err.println(e);
                return;
            }
            System.out.println("all async completed!");
        });
        // 非同期処理完了まで待機する
        future.get();
    }   
}

