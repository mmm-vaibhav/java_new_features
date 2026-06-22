package java_8.interview_practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Stream_on_numbers_easy {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(9, 10, 1,2,3, 11 ,4,5, 12,6,7,8);

        System.out.println("====== 1. Find all even numbers =====");
        List<Integer> evenNumbers = integerList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        System.out.println("\n====== 2. Find all odd numbers =====");
        List<Integer> oddNumbers = integerList.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        System.out.println(oddNumbers);
        
        System.out.println("\n====== 3. Count total elements =====");
        long count = integerList.stream().count();
        System.out.println(count);

        System.out.println("\n====== 4. sum of all number =====");
        int sum = integerList.stream().mapToInt(n -> n).sum();
        System.out.println(sum);

        System.out.println("\n====== 4. AVG of all number =====");
        OptionalDouble average = integerList.stream().mapToInt(n -> n).average();
        System.out.println(average.getAsDouble());

        System.out.println("\n====== 5. Sort in ascending =====");
        List<Integer> sorted = integerList.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);

        System.out.println("\n====== 5. Sort in descending =====");
        List<Integer> descsorted = integerList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(descsorted);

    }
}
