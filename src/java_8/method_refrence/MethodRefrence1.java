package java_8.method_refrence;

import java.util.Arrays;
import java.util.List;

public class MethodRefrence1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "cab", "bca", "cba");
        list.stream().map(String::toUpperCase).toList();
    }
}
