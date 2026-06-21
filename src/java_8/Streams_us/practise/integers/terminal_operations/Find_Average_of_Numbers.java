package java_8.Streams_us.practise.integers.terminal_operations;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Find_Average_of_Numbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40);
        OptionalDouble average = list.stream().mapToInt(Integer::intValue).average();
        System.out.println(average.getAsDouble());
    }
}
