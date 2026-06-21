package java_8.Streams_us.practise.objects.tests;

import java_8.Streams_us.practise.objects.Employee;
import java_8.Streams_us.practise.objects.EmployeeService;

import java.util.List;
import java.util.stream.Collectors;

public class Get_list_of_employee_names_from_IT_department {
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeService.createEmployeeList();
        List<String> itEmployee = employeeList.stream().filter(e -> e.getDepartment().equals("IT"))
                .map(Employee::getName).collect(Collectors.toList());
        System.out.println(itEmployee);

    }
}
