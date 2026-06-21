package java_8.Streams_us.practise.Strings;

import java.util.stream.IntStream;

public class PalindromeString {

    public static void main(String[] args) {
        String s1 = "lux";
        int length = s1.length();
        boolean flag = IntStream.range(0, length / 2).allMatch(i -> s1.charAt(i) == s1.charAt(length - i - 1));
        String result = flag ? "Palindrome" : "Not Palindrome";
        System.out.println(result);
    }
}
