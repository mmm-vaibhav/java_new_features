package java_8.interview_practise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream_on_strings_Dataset_5 {
    public static void main(String[] args) {
        String str = "java spring java kafka spring java docker";

        System.out.println("====== 1. Word frequency =====");
        Map<String, Long> wordFrequency = Arrays.stream(str.split("\\s")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(wordFrequency);

        System.out.println("\n====== 2. Duplicate words =====");
        Set<String> strSet = new HashSet<>();
        List<String> duplicateWords = Arrays.stream(str.split(" ")).filter(s -> !strSet.add(s)).distinct().collect(Collectors.toList());
        System.out.println(duplicateWords);


        System.out.println("\n====== 3. Unique words =====");
        List<String> wordList = Arrays.asList(str.split(" "));
        List<String> uniqueWords = wordList.stream().filter(words -> Collections.frequency(wordList, words) == 1).collect(Collectors.toList());
        System.out.println(uniqueWords);

        System.out.println("\n====== 4. Most frequent word =====");
        List<String> wordList1 = Arrays.asList(str.split(" "));
        String mostFrequent = wordList1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println(mostFrequent);

        System.out.println("\n====== 5. Least frequent word =====");
        List<String> wordList2 = Arrays.asList(str.split(" "));
        String LeastFrequent = wordList2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .min(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println(LeastFrequent);

    }
}
