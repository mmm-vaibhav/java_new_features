package java_8.Streams_us.practise.objects.tests;

import java_8.Streams_us.practise.objects.EmployeeService;

public class Check_if_all_employees_earn_more_than_20000 {
    public static void main(String[] args) {
        boolean b = EmployeeService.createEmployeeList()
                .stream()
                .allMatch(employee -> employee.getSalary() > 65000);
        System.out.println(b);
    }
}
