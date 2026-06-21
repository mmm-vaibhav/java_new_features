package java_8.Streams_us.sorted;

import java.util.Arrays;
import java.util.List;

public class Sorted1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(32, 47, 56, 12, 79, 50);
        list.stream()
//                .filter(i -> i % 2 == 0)
//                .map(i -> i * i)
                .sorted((i1, i2) -> Integer.compare(i1, i2))
                .forEach(System.out::println);
    }
}
