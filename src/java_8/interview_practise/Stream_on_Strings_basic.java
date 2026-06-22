package java_8.interview_practise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Stream_on_Strings_basic {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Spring", "Kafka", "Oracle", "Docker", "Java", "CI", "C");


        System.out.println("====== 1. Convert to uppercase =====");
        List<String> upperCase = words.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperCase);

        System.out.println("\n====== 2. Convert to lowercase =====");
        List<String> lowercase = words.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
        System.out.println(lowercase);

        System.out.println("\n====== 3. sort ascending alphabatically =====");
        List<String> sortAscAlpha = words.stream().sorted().collect(Collectors.toList());
        System.out.println(sortAscAlpha);


        System.out.println("\n====== 4. sort descending alphabatically =====");
        List<String> sortDescAlpha = words.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortDescAlpha);


        System.out.println("\n====== 5. sort ascending by length =====");
        List<String> sortAscByLength = words.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(sortAscByLength);


        System.out.println("\n====== 6. sort descending by length =====");
        List<String> sortDescByLength = words.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList());
        System.out.println(sortDescByLength);

        System.out.println("\n====== 7. remove duplicate =====");
        List<String> removedDuplicate = words.stream().distinct().collect(Collectors.toList());
        System.out.println(removedDuplicate);

        System.out.println("\n====== 8. Count the Strings =====");
        long count = words.stream().count();
        System.out.println(count);

        System.out.println("\n====== 9. Find shortest string =====");
        Optional<String> firstShort = words.stream().sorted(Comparator.comparing(String::length)).findFirst();
        System.out.println(firstShort.get());

        System.out.println("\n====== 10. Find logest string =====");
        Optional<String> firstLongest = words.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst();
        System.out.println(firstLongest.get());


        System.out.println("\n====== 11. Starting with J =====");
        List<String> startsWithJ = words.stream().filter(s -> s.startsWith("J")).collect(Collectors.toList());
        System.out.println(startsWithJ);


        System.out.println("\n====== 11. End with a =====");
        List<String> endWithA = words.stream().filter(s -> s.endsWith("a")).collect(Collectors.toList());
        System.out.println(endWithA);

        System.out.println("\n====== 11. Join with comma =====");
        String collect = words.stream().collect(Collectors.joining(", "));
        System.out.println(collect);


    }
}
