package java_21;

public class VirtualDemo {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Hello.... from virtual thread" + Thread.currentThread().getName());
        };
        Thread.startVirtualThread(runnable);
    }
}
