package java_8.interview_practise;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream_on_strings_Dataset_5 {
    public static void main(String[] args) {
        String str = "java spring java kafka spring java docker";

        System.out.println("====== 1. Word frequency =====");
        str.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
