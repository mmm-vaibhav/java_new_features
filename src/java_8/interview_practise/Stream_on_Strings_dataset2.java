package java_8.interview_practise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream_on_Strings_dataset2 {

    public static void main(String[] args) {
        List<String> words =
                Arrays.asList(
                        "Java",
                        "Spring",
                        "Kafka",
                        "Java",
                        "Docker",
                        "Kafka",
                        "Redis"
                );

        System.out.println("====== 1. Duplicate strings =====");
        HashSet<String> strSet = new HashSet<>();
        List<String> collect = words.stream().filter(s -> !strSet.add(s)).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("\n====== 2. unique strings =====");
        List<String> unique = words.stream().filter(s -> Collections.frequency(words, s) == 1).collect(Collectors.toList());
        System.out.println(unique);

        System.out.println("\n====== 3. frequency of strings =====");
        Map<String, Long> groupped = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(groupped);

        List<String> words1 = Arrays.asList(
                "Java", "SpringBoot", "Java", "Kafka",
                "Java", "REST", "SpringBoot", "Kafka", "Java",
                "Docker", "Kubernetes", "Docker"
        );

        System.out.println("\n====== 4. Most repeating strings =====");
        String mostRepeatedWord = words1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println(mostRepeatedWord);

        System.out.println("\n====== 5. Least repeating strings =====");
        String leastRepeatingString = words1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .min(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        System.out.println(leastRepeatingString);

    }
}
