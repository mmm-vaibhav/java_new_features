package java_8.Streams_us.practise.integers.terminal_operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Find_Top_3_Largest_Numbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 8, 1, 1);
        List<Integer> collect = list.stream().distinct().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println(collect);
    }
}
