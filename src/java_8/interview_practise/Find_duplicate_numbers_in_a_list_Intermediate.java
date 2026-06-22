package java_8.interview_practise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_duplicate_numbers_in_a_list_Intermediate {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(6,1,2,2,3,3,4,5);
        System.out.println("====== 1. the duplicate numbers =====");
        Set<Integer> intSet = new HashSet<>();
        List<Integer> duplicateNumbers = intList.stream().filter(i -> !intSet.add(i)).collect(Collectors.toList());
        System.out.println(duplicateNumbers);

        System.out.println("\n====== 2. remove duplicate =====");
        List<Integer> removedDuplicateNumbers = intList.stream().distinct().collect(Collectors.toList());
        System.out.println(removedDuplicateNumbers);

        System.out.println("\n====== 3. Largest Number =====");
        Optional<Integer> max = intList.stream().max(Comparator.comparing(Integer::intValue));
        System.out.println(max.get());

        System.out.println("\n====== 4. smallest Number =====");
        Optional<Integer> min = intList.stream().min(Comparator.comparing(Integer::intValue));
        System.out.println(min.get());

        System.out.println("\n====== 5. 2nd Largest Number =====");
        Optional<Integer> secoondMax = intList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(secoondMax.get());
                                                
        System.out.println("\n====== 6. 2nd smallest Number =====");
        Optional<Integer> SecondMin = intList.stream().distinct().sorted(Comparator.comparing(Integer::intValue)).skip(1).findFirst();
        System.out.println(SecondMin.get());

        System.out.println("\n====== 6. top 3 largest Numbers =====");
        List<Integer> top3 = intList.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println(top3);

        System.out.println("\n====== 6. top 3 smallest Numbers =====");
        List<Integer> less3 = intList.stream().sorted(Comparator.comparing(Integer::intValue)).limit(3).collect(Collectors.toList());
        System.out.println(less3);


        System.out.println("\n====== 7. frequency of each Numbers =====");
        Map<Integer, Long> frequency = intList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequency);

        System.out.println("\n====== 8. Even/odd using partition by =====");
        Map<Boolean, List<Integer>> collect = intList.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(collect);

        System.out.println("\n====== 9. Numbers greater 3 =====");
        List<Integer> greater3 = intList.stream().filter(i -> i > 3).collect(Collectors.toList());
        System.out.println(greater3);

        System.out.println("\n====== 10. First number greater 3 =====");
        Optional<Integer> opt = intList.stream().filter(i -> i > 3).sorted(Comparator.naturalOrder()).findFirst();
        System.out.println(opt.get());

        System.out.println("\n====== 11. Find unique numbers =====");
        List<Integer> uniqueNumbers = intList.stream().filter(n -> Collections.frequency(intList, n) == 1).collect(Collectors.toList());
        System.out.println(uniqueNumbers);
    }
}
