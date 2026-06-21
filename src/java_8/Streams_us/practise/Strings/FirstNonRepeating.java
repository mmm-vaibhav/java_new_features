package java_8.Streams_us.practise.Strings;

import java.util.Optional;

public class FirstNonRepeating {

    public static void main(String[] args) {
        String str = "Hello World";
//        str.chars().filter(ch );
        Optional<String> first = str.chars()
                .filter(ch -> str.indexOf(ch) == str.lastIndexOf(ch))
                .mapToObj(ch -> String.valueOf((char)ch))
                .findFirst();
        System.out.println(first.get());
    }
}
