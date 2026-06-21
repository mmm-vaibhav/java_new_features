package java_8.Streams_us.practise.integers.terminal_operations;

import java.util.Arrays;
import java.util.List;

public class Get_a_list_where_5_is_added_to_each_number {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> list1 = list.stream().map(i -> i + 5).toList();
        System.out.println(list1);
    }
}
