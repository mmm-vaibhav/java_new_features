package java_8.Streams_us.practise.integers.terminal_operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Find_Second_Largest_Number {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        list.stream().mapToInt(Integer::intValue).sorted();

        List<Integer> numbers = Arrays.asList(10, 20, 4, 45, 99, 99, 32, 45);

        // Method 2: Using reduce() without sorting
        Optional<Integer> secondLargest = numbers.stream()
                .reduce((first, second) -> {
                    // Track two largest numbers
                    int[] max = {Integer.MIN_VALUE, Integer.MIN_VALUE};

                    // This is a simplified representation - actual implementation needs more work
                    // Better to use collectors or custom logic
                    return second;
                });
        
        
        
        System.out.println(secondLargest.get());
    }
}
