package java_8.Streams_us.numbers;

import java.util.Arrays;
import java.util.List;

public class IntegerOperations {

    List<Integer> integerList = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);

    //find the sum of list
    public void sum() {
        System.out.println("========== Sum ================");
        int sum = integerList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }

}
