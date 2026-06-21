package java_8.Streams_us.practise.objects.tests;

import java_8.Streams_us.practise.objects.Employee;
import java_8.Streams_us.practise.objects.EmployeeService;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Group_employees_by_department {
    public static void main(String[] args) {
        Map<String, List<Employee>> collect = EmployeeService.createEmployeeList().stream().collect(Collectors.groupingBy(Employee::getDepartment));
        collect.forEach((department, employees) -> System.out.println(department+ " : "+employees));

        System.out.println("================Employee Count=====================");
        Map<String, Long> collect1 = EmployeeService.createEmployeeList().stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
//        System.out.println(collect);
        collect1.forEach((department, employees) -> System.out.println(department+ " : "+employees));

        System.out.println("================Department wise ave salary=====================");
        Map<String, Double> collect2 = EmployeeService.createEmployeeList().stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        collect2.forEach((department, salary) -> System.out.println(department+ " : "+salary));

        System.out.println("================Department wise highest salary=====================");
        Map<String, Optional<Employee>> collect3 = EmployeeService.createEmployeeList().stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        collect3.forEach((department, employee) -> System.out.println(department+ " : "+employee.get()));
    }
}
