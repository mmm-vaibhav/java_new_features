package java_8.Streams_us.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Filter1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(32, 47, 56, 12, 79, 50);
        list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);


    }
}
