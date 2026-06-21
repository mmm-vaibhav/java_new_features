package java_8.Streams_us.practise.integers.terminal_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Salary_Threshold_Filter {

    //Get all salaries eligible for tax (> 25k).
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(18000, 25000, 32000, 15000, 40000);
        List<Integer> collect = numbers.stream().filter(number -> number > 25000).collect(Collectors.toList());
        System.out.println(collect);
    }
}
