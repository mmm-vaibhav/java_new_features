package java_8.Streams_us.practise.integers.terminal_operations;

import java.util.stream.IntStream;

public class Prime_Number {

    public static void main(String[] args) {
        int number = 16;
        boolean flag = IntStream.range(2, (int)Math.sqrt(number)).noneMatch(i -> number % i == 0);
        String result = flag ? "Yes" : "No";
        System.out.println(result);
    }
}
