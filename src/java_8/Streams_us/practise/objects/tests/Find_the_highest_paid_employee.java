package java_8.Streams_us.practise.objects.tests;

import java_8.Streams_us.practise.objects.Employee;
import java_8.Streams_us.practise.objects.EmployeeService;

import java.util.Comparator;
import java.util.Optional;

public class Find_the_highest_paid_employee {
    public static void main(String[] args) {
        Optional<Employee> max = EmployeeService.createEmployeeList()
                .stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(max);
    }
}
