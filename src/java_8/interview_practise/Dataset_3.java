package java_8.interview_practise;

import java.util.*;
import java.util.stream.Collectors;

public class Dataset_3 {
    public static void main(String[] args) {
        List<String> words =
                Arrays.asList(
                        "Java",
                        "SpringBoot",
                        "Microservices",
                        "Kafka",
                        "REST",
                        "Docker",
                        "Kubernetes"
                );

        System.out.println("====== 1. Longest strings =====");
        Optional<String> collect = words.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst();
        System.out.println(collect.get());

        System.out.println("\n====== 2. Shortest strings =====");
        HashSet<String> strSet = new HashSet<>();
        Optional<String> collect1 = words.stream().sorted(Comparator.comparing(String::length)).findFirst();
        System.out.println(collect1.get());

        System.out.println("\n====== 3. top 3 longest strings =====");
        List<String> collect3 = words.stream().sorted(Comparator.comparing(String::length).reversed()).limit(3).collect(Collectors.toList());
        System.out.println(collect3);

        System.out.println("\n====== 4. top 3 shortest strings =====");
        List<String> collect4 = words.stream().sorted(Comparator.comparing(String::length)).limit(3).collect(Collectors.toList());
        System.out.println(collect4);

        System.out.println("\n====== 5. Group by length =====");
        Map<Integer, List<String>> collect2 = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect2);

        System.out.println("\n====== 5. Group by letter =====");
        Map<Character, List<String>> collects2 = words.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(collects2);
    }
}
