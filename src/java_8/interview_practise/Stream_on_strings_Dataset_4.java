package java_8.interview_practise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_on_strings_Dataset_4 {
    public static void main(String[] args) {
        String str = "programming";

        System.out.println("====== 1. Character frequency =====");
        Map<Character, Long> freqMap = str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freqMap);

        System.out.println("====== 2. Duplicate Characters =====");
        Set<Character> charSet = new HashSet<>();
        List<Character> duplicateChar = str.chars().mapToObj(ch -> (char) ch).filter(ch -> !charSet.add(ch)).collect(Collectors.toList());
        System.out.println(duplicateChar);

        System.out.println("====== 3. Unique  Characters =====");
        List<Character> charList = str.chars().mapToObj(ch -> (char) ch).collect(Collectors.toList());
        List<Character> collect = charList.stream().filter(ch -> Collections.frequency(charList, ch) == 1).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("====== 4. first repeated  Characters =====");
        Character c = str.chars().mapToObj(ch -> (char) ch).filter(ch -> str.indexOf(ch) != str.lastIndexOf(ch)).findFirst().orElse(null);
        System.out.println(c);

        System.out.println("====== 5. first non repeated  Characters =====");
        Character nonRepeatedChar = str.chars().mapToObj(ch -> (char) ch).filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch)).findFirst().orElse(null);
        System.out.println(nonRepeatedChar);

        System.out.println("====== 6. reverse String =====");
        String collect1 = IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(str.length() - 1 - i))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(collect1);

    }
}
