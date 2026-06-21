package java_8.Streams_us.practise.objects.tests;

import java_8.Streams_us.practise.objects.Employee;
import java_8.Streams_us.practise.objects.EmployeeService;

import java.util.Comparator;
import java.util.Optional;

public class Find_second_highest_paid_employee {
    public static void main(String[] args) {
        Optional<Employee> second = EmployeeService.createEmployeeList()
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1)
                .findFirst();
        System.out.println(second.get());
    }
}
