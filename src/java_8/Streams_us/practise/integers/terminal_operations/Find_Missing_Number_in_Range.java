package java_8.Streams_us.practise.integers.terminal_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Find_Missing_Number_in_Range {
//Find Missing Number in Range
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 4, 5);
        int sum = numbers.stream().mapToInt(n -> n).sum();
        int sum1 = IntStream.rangeClosed(1, 5).sum();
        System.out.println(sum1 - sum);
    }
}
