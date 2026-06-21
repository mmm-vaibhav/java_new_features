package java_8.Streams_us.practise.integers.terminal_operations;

import java.util.Arrays;

public class Filter_the_even_numbers {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array = Arrays.stream(arr).filter(i -> i % 2 == 0).toArray();
        System.out.println(Arrays.toString(array));
    }

}
