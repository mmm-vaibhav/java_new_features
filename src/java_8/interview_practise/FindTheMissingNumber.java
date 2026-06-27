package java_8.interview_practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindTheMissingNumber {

    public static void main(String[] args) {
        List<Integer> nums =
                Arrays.asList(1,2,3,5,6);
        int n = 6;
        int expectedSum = IntStream.rangeClosed(1, n).sum();
        int actualSum = nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println(expectedSum - actualSum);
    }
}
