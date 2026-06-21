package java_9.completableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        System.out.println("Main started running..");
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return "hello";
        });
        System.out.println("Main continuing..");
        System.out.println("Result of completable future:: "+future.join());
        System.out.println("Main ended running..");


    }
}
