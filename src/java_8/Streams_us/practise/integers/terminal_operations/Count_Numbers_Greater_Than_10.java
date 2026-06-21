package java_8.Streams_us.practise.integers.terminal_operations;

import java.util.Arrays;
import java.util.List;

public class Count_Numbers_Greater_Than_10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 12, 18, 3, 9);
        long count = list.stream().mapToInt(Integer::intValue).filter(i -> i > 10).count();
        System.out.println(count);
    }
}
