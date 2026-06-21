package java_8.Streams_us.practise.Strings;

public class Count_vowels_in_a_string {
    public static void main(String[] args) {
        String str = "Hello World";
        long count = str.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) != -1).count();
        System.out.println(count);
    }
}
