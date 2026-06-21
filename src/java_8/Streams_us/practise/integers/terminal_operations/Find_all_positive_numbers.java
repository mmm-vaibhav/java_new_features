package java_8.Streams_us.practise.integers.terminal_operations;

import java.util.Arrays;

public class Find_all_positive_numbers {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 12, -3, 8, -15, 0, 7, -20};
        arr = Arrays.stream(arr).filter(i -> i > 0).toArray();
        System.out.println(Arrays.toString(arr));
    }
}
