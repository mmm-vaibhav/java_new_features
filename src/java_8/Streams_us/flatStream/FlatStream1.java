package java_8.Streams_us.flatStream;

import java.util.Arrays;
import java.util.List;

public class FlatStream1 {

    public static void main(String[] args) {
        List<List<Integer>> listofIntegers = Arrays.asList(
                Arrays.asList(5,1,8),
                Arrays.asList(6,2,9),
                Arrays.asList(7,3,6)
        );

//        List<Integer> list1 = listofIntegers.stream().flatMap(list -> list.stream()).toList();
        List<Integer> list = listofIntegers.stream().flatMap(List::stream).toList();
        list.forEach(System.out::println);
    }
}
