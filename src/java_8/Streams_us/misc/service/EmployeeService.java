package java_8.Streams_us.misc.service;

import java_8.Streams_us.misc.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService {

    private static List<Employee> getEmployees() {
        return Arrays.asList(new Employee(7516, "Scott", 7500d, "Sales"),
                new Employee(7516, "Micheal", 7500d, "Sales"),
                new Employee(7167, "Turner", 6000d, "IT"),
                new Employee(7216, "David", 5000d, "Research"),
                new Employee(7144, "Clara", 7000d, "HR"),
                new Employee(7984, "Miller", 9000d, "IT"),
                new Employee(7154, "Scott", 8000d, "HR"),
                new Employee(7689, "John", 7500d, "IT"),
                new Employee(7378, "Sophia", 4000d, "HR"),
                new Employee(7625, "Edward", 4000d, "Accounting"),
                new Employee(7763, "Smith", 7000d, "HR"),
                new Employee(7815, "Clark", 9000d, "Accounting")
                );
    }

    //fetch emp from the given dept.
    public  void fetchEmployeeByDept(String dept) {
        List<Employee> employees = getEmployees();
        employees.stream()
                .filter(e -> e.getDept().equalsIgnoreCase(dept))
                .forEach(System.out::println);

    }

    //fetch max paid employee
    public void maxPaidEmp() {
        System.out.println("============= 1st method ======================");
        Optional<Employee> employee = getEmployees().stream().min((e1, e2) -> Double.compare(e2.getSal(), e1.getSal()));
        if(employee.isPresent()){
            System.out.println(employee.get());
        }

        System.out.println("============= 2nd method ======================");
        Employee employee1 = employee.stream().max(Comparator.comparingDouble(Employee::getSal)).orElse(null);
        System.out.println(employee1);
    }

    // fetch the 2nd most paid employee
    public void secondHighestPaidEmp() {
        System.out.println("============= 2nd most paid ======================");
        getEmployees().stream().sorted(Comparator.comparingDouble(Employee::getSal).reversed())
                .skip(1).findFirst().ifPresent(System.out::println);
    }

    //grouping operations
    //group the employee based on dept
    public void groupByDept() {
        System.out.println("============= group the employee based on dept =====================");
        Map<String, List<Employee>> collect = getEmployees().stream().collect(Collectors.groupingBy(Employee::getDept));
        collect.forEach((k,v) -> System.out.println(k + " : " + v));
    }
    
    //Count the employee of list by dept
    public void numberofEmplByDept() {
        System.out.println("============= numberofEmplByDept =====================");
        Map<String, Long> collect = getEmployees().stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
        collect.forEach((k,v) -> System.out.println("Employees in " + k + " ==> " + v));
    }

    //find avg salary by dept
    public void avgSalaryByDept() {
        System.out.println("============= avg salary by dept =====================");
        Map<String, Double> collect = getEmployees().stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingDouble(Employee::getSal)));
        collect.forEach((k,v) -> System.out.println(k + " : " + v));
    }

    //avg salary of all them employee
    public void avgSalary() {
        System.out.println("============= avg salary of the list =====================");
        Double collect = getEmployees()
                .stream()
                .distinct()
                .mapToDouble(Employee::getSal)
                .average()
                .getAsDouble();
        System.out.println(collect);
    }

    public void filterEmplyeeBySal(Double sal) {
        System.out.println("============= filter emplyee by sal ==================");
        List<Employee> employees = getEmployees();

        long s = System.currentTimeMillis();
        employees
                .stream()
                .distinct()
                .filter(e -> e.getSal() > sal)
                .forEach(System.out::println);
        long e = System.currentTimeMillis();
        System.out.println("Time taken:: "+ (e - s));
    }


    public void filterEmplyeeBySal1(Double sal) {
        System.out.println("============= filterEmplyeeBySal1==================");
        List<Employee> employees = getEmployees();

        long s = System.currentTimeMillis();
        employees
                .parallelStream()
                .distinct()
                .filter(e -> e.getSal() > sal)
                .forEach(System.out::println);
        long e = System.currentTimeMillis();
        System.out.println("Time taken:: "+ (e - s));
    }

}
