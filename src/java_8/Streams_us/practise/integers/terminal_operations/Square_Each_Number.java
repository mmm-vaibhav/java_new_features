package java_8.Streams_us.practise.integers.terminal_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Square_Each_Number {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6);
        List<Integer> collect = numbers.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(collect);
    }
}
