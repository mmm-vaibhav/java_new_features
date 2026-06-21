package java_8.Streams_us.practise.integers.terminal_operations;

import java.util.stream.IntStream;

public class Zero_TO_Ten {
    public static void main(String[] args) {
        IntStream.rangeClosed(10, 0).forEach(System.out::println);
    }
}
