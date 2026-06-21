package java_8.Streams_us.practise.integers.terminal_operations;

import java.util.Arrays;
import java.util.List;

public class Create_a_new_list_where_each_number_is_squared {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list1 = list.stream().map(i -> i * i).toList();
        System.out.println(list1);
    }
}
