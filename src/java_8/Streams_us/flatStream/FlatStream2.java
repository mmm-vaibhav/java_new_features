package java_8.Streams_us.flatStream;

import java.util.*;
import java.util.stream.Stream;

//create a list of list String flatten them to a single list of Strings.
//fetch the Strings whose length is even,covert them to UPPERCASE and display them in descending order.

public class FlatStream2 {

    public static void main(String[] args) {
        List<List<String>> listOfLists = new ArrayList<>();

// Method 1: Create and add in separate steps
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        listOfLists.add(fruits);
        listOfLists.add(Arrays.asList("dog", "cat", "bird"));
        listOfLists.add(Arrays.asList("red", "green", "blue"));
        listOfLists.add(List.of("java", "python", "c++"));
        System.out.println(listOfLists);

        listOfLists.stream()
                .flatMap(Collection::stream)
                .filter(s -> s.length() % 2 != 0)
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
