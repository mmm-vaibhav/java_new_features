package java_8.Streams_us.practise.integers.terminal_operations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class Myntra_Nth_Highest_salary {

    static Double[] salary = new Double[]{75000.50, 85000.12, 95000.56, 25000.89, 35000.90};

    public static void main(String[] args) {
        System.out.println("Enter the nth salary to find.");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Double highest = getNthSalary(n);
        System.out.println("The nth highest salary is: " + highest);
    }

    private static Double getNthSalary(int n) {
        Optional<Double> first = Arrays.asList(salary)
                .stream()
                .sorted(Comparator.reverseOrder())
                .skip(n - 1)
                .findFirst();
        return first.get();
    }
}
