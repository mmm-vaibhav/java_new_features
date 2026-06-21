package java_8.Streams_us.practise.objects.tests;

import java_8.Streams_us.practise.objects.Employee;
import java_8.Streams_us.practise.objects.EmployeeService;

import java.util.stream.Collectors;

public class Get_comma_separated_names_of_employees {
    public static void main(String[] args) {
        String collect = EmployeeService.createEmployeeList()
                .stream()
                .map(Employee::getName)
                .collect(Collectors.joining(", "));
        System.out.println(collect);
    }
}
