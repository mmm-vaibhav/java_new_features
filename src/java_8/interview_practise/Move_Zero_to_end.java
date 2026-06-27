package java_8.interview_practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Move_Zero_to_end {

    public static void main(String[] args) {
        List<Integer> nums =
                Arrays.asList(0,1,0,3,12);

        List<Integer> collect = Stream.concat(nums.stream().filter(n -> n != 0), nums.stream().filter(n -> n == 0)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
