package java_8.Streams_us.practise.objects.tests;

import java_8.Streams_us.practise.objects.Employee;
import java_8.Streams_us.practise.objects.EmployeeService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Find_employees_with_duplicate_names {
    public static void main(String[] args) {
        List<String> list = EmployeeService.createEmployeeList()
                .stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.println(list);
    }
}
