package java_8.Streams_us.practise.integers.terminal_operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Transaction_Fraud_Detection {

    //Identify suspicious transactions (> 10k).
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(500, 12000, 7000, 30000, 1500);
        List<Integer> collect = intList.stream().filter(i -> i > 10000).collect(Collectors.toList());
        System.out.println(collect);
    }
}
