package java_8.Streams_us.map;

import java.util.Arrays;
import java.util.List;

public class Map1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(32, 47, 56, 12, 79, 50);

        //need to perform square of the each element.
        list.stream().map(i -> i * i).forEach(System.out::println);
    }
}
