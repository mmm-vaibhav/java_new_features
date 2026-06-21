package java_8.Streams_us.practise.objects.tests;

import java_8.Streams_us.practise.objects.Employee;
import java_8.Streams_us.practise.objects.EmployeeService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Partition_employees_by_salary_80000 {
    public static void main(String[] args) {
        Map<Boolean, List<Employee>> collect = EmployeeService.createEmployeeList()
                .stream()
                .collect(Collectors.partitioningBy(
                        employee -> employee.getSalary() > 80000
                ));
        System.out.println(collect);
    }
}
