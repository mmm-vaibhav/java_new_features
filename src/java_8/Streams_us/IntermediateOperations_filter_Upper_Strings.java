package java_8.Streams_us;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IntermediateOperations_filter_Upper_Strings {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("hello", "world","java", "code", "complete", "password",
                "username",
                "test1234",
                "this is a test string",
                "programming",
                "concurrent",
                "hashmap internal implementation");
        strList.stream()
                .filter(s -> s.length() > 8)
                .map(s -> s.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
