package java_8.Streams_us.practise.objects.tests;

import java_8.Streams_us.practise.objects.Employee;
import java_8.Streams_us.practise.objects.EmployeeService;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_employees_by_salary {
    public static void main(String[] args) {
        List<Employee> list = EmployeeService.createEmployeeList()
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .toList();
        System.out.println(list);

        System.out.println("============= Employees Sorted by age =============");
        List<Employee> list1 = EmployeeService.createEmployeeList()
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getAge))
                .toList();
        System.out.println(list1);
    }
}
