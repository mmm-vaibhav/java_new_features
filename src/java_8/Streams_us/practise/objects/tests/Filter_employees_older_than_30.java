package java_8.Streams_us.practise.objects.tests;

import java_8.Streams_us.practise.objects.Employee;
import java_8.Streams_us.practise.objects.EmployeeService;

import java.util.List;
import java.util.stream.Collectors;

public class Filter_employees_older_than_30 {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeService.createEmployeeList();
        List<Employee> collect = employeeList.stream().filter(e -> e.getAge() > 30).collect(Collectors.toList());
        System.out.println(collect);
    }
}
