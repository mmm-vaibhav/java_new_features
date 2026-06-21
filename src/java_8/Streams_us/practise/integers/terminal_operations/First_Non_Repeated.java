package java_8.Streams_us.practise.integers.terminal_operations;

import java.util.*;
import java.util.stream.Collectors;

public class First_Non_Repeated {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 3, 7);
        Optional<Integer> first = numbers.stream().filter(i -> Collections.frequency(numbers, i) == 1).findFirst();
        System.out.println(first.get());
        
        
        String str = "Hello World";
        
        OptionalInt first1 = str.replace("\\s", "").chars()
                .filter(ch -> Collections.frequency(numbers, ch) == 1).findFirst();
    }
}
