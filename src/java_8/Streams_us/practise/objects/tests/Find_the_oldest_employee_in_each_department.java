package java_8.Streams_us.practise.objects.tests;

import java_8.Streams_us.practise.objects.Employee;
import java_8.Streams_us.practise.objects.EmployeeService;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Find_the_oldest_employee_in_each_department {

    public static void main(String[] args) {
        Employee employee = EmployeeService.createEmployeeList()
                .stream()
                .max(Comparator.comparing(Employee::getAge))
                .orElse(null);

        System.out.println(employee);

        System.out.println("============== Older Emp in each dept ===========");
        Map<String, Optional<Employee>> collect = EmployeeService.createEmployeeList()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getAge))));
        collect.forEach((department, employee1) -> System.out.println(department+ " : "+employee1.get()));
    }
}
