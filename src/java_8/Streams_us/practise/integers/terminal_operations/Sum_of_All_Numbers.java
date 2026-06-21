package java_8.Streams_us.practise.integers.terminal_operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Sum_of_All_Numbers {
    public static void main(String[] args) {
        int[] arr = new int[] {10, 20, 30};
        int sum = IntStream.of(arr).sum();
        System.out.println(sum);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int sum1 = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum1);
    }
}
