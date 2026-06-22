package java_8.Streams_us.practise.integers.terminal_operations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Find_Maximum_Number {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 7, 1, 9, 3};
//        Arrays.stream(arr).max().ifPresent(System.out::println);
        OptionalInt max = IntStream.of(arr).max();
        System.out.println(max.getAsInt());

        List<Integer> intList = Arrays.asList(4, 7, 1, 9, 3);
        OptionalInt max1 = intList.stream().mapToInt(i -> i).max();
        System.out.println(max1.getAsInt());

    }
}
