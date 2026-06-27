package java_8.Streams_us;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindAllMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 5, 8};
        List<Integer> result = getAllMissingNumbers(arr);
        System.out.println(result);
    }

    private static List<Integer> getAllMissingNumbers(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();
        Set<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        return IntStream.rangeClosed(min, max).boxed().filter(i -> !collect.contains(i)).collect(Collectors.toList());
    }
}
