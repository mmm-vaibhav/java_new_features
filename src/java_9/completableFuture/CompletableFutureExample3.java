package java_9.completableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample3 {

    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> {
                return 10/2;}).exceptionally( ex -> {
                    System.out.println("MYException:: " +ex.getMessage());
                    return 0;
                }).thenAccept(System.out::println);
    }
}
