package java_8.Streams_us.practise.objects.tests;

import java_8.Streams_us.practise.objects.Employee;
import java_8.Streams_us.practise.objects.EmployeeService;

import java.util.List;
import java.util.stream.Collectors;

public class Get_distinct_department_names {
    public static void main(String[] args) {
        List<String> list = EmployeeService.createEmployeeList()
                .stream()
                .map(Employee::getDepartment)
                .distinct()
                .toList();
        System.out.println(list);
    }
}
