package java_8.Streams_us.practise.objects.tests;

import java_8.Streams_us.practise.objects.Employee;
import java_8.Streams_us.practise.objects.EmployeeService;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Get_youngest_male_employee_in_IT_department {
    public static void main(String[] args) {
        Optional<Employee> min = EmployeeService.createEmployeeList()
                .stream()
                .filter(e -> e.getDepartment().equals("IT") && e.getGender().equals("Male"))
                .min(Comparator.comparingInt(Employee::getAge));
//        List<Employee> list = min;
        System.out.println(min);
    }
}
