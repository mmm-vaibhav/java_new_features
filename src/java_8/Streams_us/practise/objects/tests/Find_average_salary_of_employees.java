package java_8.Streams_us.practise.objects.tests;

import java_8.Streams_us.practise.objects.Employee;
import java_8.Streams_us.practise.objects.EmployeeService;

import java.util.List;
import java.util.OptionalDouble;

public class Find_average_salary_of_employees {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeService.createEmployeeList();
        OptionalDouble average = employeeList.stream().mapToDouble(Employee::getSalary).average();
        System.out.println(average.getAsDouble());
    }
}
