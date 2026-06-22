package java_8.interview_practise;

import java.util.*;
import java.util.stream.Collectors;

public class Stream_on_numbers_hard {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(9,10, 1,2,3,11,4,5,12,6,7,8);

        System.out.println("====== 1. Find kth highest number =====");
        int k = 3;
        Optional<Integer> first = integerList.stream().sorted(Comparator.reverseOrder()).skip(k - 1).findFirst();
        System.out.println(first.get());

        System.out.println("\n====== 2. Find kth smallest number =====");
        int q = 4;
        Optional<Integer> firstSmallest = integerList.stream().sorted().skip(q - 1).findFirst();
        System.out.println(firstSmallest.get());


        System.out.println("\n====== 10. Find product of all numbers =====");
//        integerList.stream().mapToInt( n -> n)
    }
}
