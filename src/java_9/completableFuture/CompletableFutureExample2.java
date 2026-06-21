package java_9.completableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample2 {

    public static void main(String[] args) {
        CompletableFuture.supplyAsync(() -> "Hello")
                .thenApply(s -> s + " world".toUpperCase())
                .thenAccept(System.out::println);
    }
}
