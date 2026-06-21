package java_8.Streams_us.practise.objects.tests;

import java_8.Streams_us.practise.objects.Employee;
import java_8.Streams_us.practise.objects.EmployeeService;

import java.util.Map;
import java.util.stream.Collectors;

public class Total_salary_expenditure_per_department {
    public static void main(String[] args) {
        Map<String, Double> collect = EmployeeService.createEmployeeList()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
        System.out.println(collect);
    }
}
