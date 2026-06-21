package java_8.Streams_us.practise.Strings;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Hello World";
        String reduce = str.chars().mapToObj(ch -> String.valueOf((char)ch)).reduce("", (a, b) -> b + a);
//        #.ifPresent(System.out::println);
        System.out.println(reduce);
    }
}
