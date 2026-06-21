package java_8.Streams_us.practise.integers.terminal_operations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Separate_Odd_and_Even_Numbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<String, Integer> collect = numbers.stream().collect(Collectors.groupingBy(i ->
                i % 2 == 0 ? "Even" : "Odd",Collectors.summingInt( i -> i)));
        System.out.println(collect);
    }
}
