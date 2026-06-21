package java_9.completableFuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample4 {

    public static void main(String[] args) {
        CompletableFuture<Double> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {

            }
            return 75.08;
        });

        CompletableFuture<Double> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {

            }
            return 1.8;
        });

        future1.thenCombine(future2, (x, y) -> x / (y * y))
                .thenApply(x -> "BMS is: " + x).thenAccept(System.out::println);

        Double join = future1.join();

//        try{
//            Thread.sleep(20000);
//        } catch (InterruptedException e) {
////            e
//        }
    }
}
