package java_8.Streams_us.practise.integers.terminal_operations;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Convert_List_to_Set {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 4);
//        List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
        int[] array = list.stream().mapToInt(Integer::intValue).distinct().toArray();
        System.out.println(Arrays.toString(array));


        Set<Integer> collect = list.stream().collect(Collectors.toSet());
        System.out.println(collect);
    }
}
