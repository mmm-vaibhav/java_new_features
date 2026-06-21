package java_8.Streams_us.practise.integers.terminal_operations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Find_Duplicate_Numbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 8, 1, 1);
        Set<Integer> set = new HashSet<>();
        Set<Integer> collect = list.stream().filter(n -> !set.add(n)).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
