package java_8.Streams_us.practise.objects.tests;

import java_8.Streams_us.practise.objects.Employee;
import java_8.Streams_us.practise.objects.EmployeeService;

import java.util.Comparator;
import java.util.stream.Stream;

public class Sort_The_employees_by_age_then_name {
    public static void main(String[] args) {
        Stream<Employee> sorted = EmployeeService.createEmployeeList()
                .stream()
                .sorted(Comparator.comparingInt(Employee::getAge).thenComparing(Employee::getName));
        sorted.forEach(System.out::println);
    }
}
