package java_8.Streams_us.practise.objects;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeService {

    public static List<Employee> createEmployeeList() {
        List<Employee> employees = new ArrayList<>();

        // Sample skills lists
        List<String> javaSkills = Arrays.asList("Java", "Spring", "SQL");
        List<String> pythonSkills = Arrays.asList("Python", "Django", "ML");
        List<String> frontendSkills = Arrays.asList("JavaScript", "React", "HTML", "CSS");
        List<String> fullstackSkills = Arrays.asList("Java", "React", "SQL", "AWS");
        List<String> devopsSkills = Arrays.asList("Docker", "Kubernetes", "AWS", "Linux");
        List<String> dataScienceSkills = Arrays.asList("Python", "R", "Statistics", "ML");
        List<String> hrSkills = Arrays.asList("Recruitment", "Communication", "Management");
        List<String> financeSkills = Arrays.asList("Accounting", "Excel", "Taxation");
        List<String> salesSkills = Arrays.asList("Negotiation", "Communication", "CRM");
        List<String> marketingSkills = Arrays.asList("SEO", "Social Media", "Analytics");

        // Adding employees with realistic data
        employees.add(new Employee(1, "John Doe", 28, "IT", 75000, "Male",
                javaSkills, LocalDate.of(2020, 3, 15), "New York"));

        employees.add(new Employee(2, "Jane Smith", 32, "IT", 82000, "Female",
                pythonSkills, LocalDate.of(2019, 6, 22), "San Francisco"));

        employees.add(new Employee(3, "Robert Johnson", 45, "HR", 65000, "Male",
                hrSkills, LocalDate.of(2015, 1, 10), "Chicago"));

        employees.add(new Employee(4, "Emily Brown", 29, "Finance", 70000, "Female",
                financeSkills, LocalDate.of(2021, 8, 5), "Boston"));

        employees.add(new Employee(5, "Michael Chen", 35, "IT", 95000, "Male",
                fullstackSkills, LocalDate.of(2018, 4, 18), "Seattle"));

        employees.add(new Employee(6, "Sarah Wilson", 27, "Sales", 60000, "Female",
                salesSkills, LocalDate.of(2022, 2, 28), "Los Angeles"));

        employees.add(new Employee(7, "David Lee", 31, "IT", 88000, "Male",
                devopsSkills, LocalDate.of(2020, 11, 12), "Austin"));

        employees.add(new Employee(8, "Lisa Taylor", 38, "Marketing", 72000, "Female",
                marketingSkills, LocalDate.of(2017, 9, 30), "Denver"));

        employees.add(new Employee(9, "James Miller", 42, "Finance", 85000, "Male",
                financeSkills, LocalDate.of(2016, 7, 14), "New York"));

        employees.add(new Employee(10, "Jennifer Davis", 26, "IT", 68000, "Female",
                frontendSkills, LocalDate.of(2023, 1, 15), "San Francisco"));

        employees.add(new Employee(11, "Thomas Anderson", 33, "IT", 92000, "Male",
                dataScienceSkills, LocalDate.of(2019, 12, 1), "Boston"));

        employees.add(new Employee(12, "Maria Garcia", 29, "HR", 62000, "Female",
                hrSkills, LocalDate.of(2021, 5, 20), "Chicago"));

        employees.add(new Employee(13, "Kevin White", 36, "Sales", 75000, "Male",
                salesSkills, LocalDate.of(2018, 10, 8), "Los Angeles"));

        employees.add(new Employee(14, "Amanda Clark", 40, "Marketing", 78000, "Female",
                marketingSkills, LocalDate.of(2015, 3, 25), "New York"));

        employees.add(new Employee(15, "Richard Moore", 31, "IT", 87000, "Male",
                javaSkills, LocalDate.of(2020, 9, 17), "Seattle"));

        // Adding some duplicate names for testing
        employees.add(new Employee(16, "John Doe", 41, "Finance", 90000, "Male",
                financeSkills, LocalDate.of(2014, 2, 10), "Boston"));

        employees.add(new Employee(17, "Sarah Wilson", 34, "IT", 80000, "Female",
                fullstackSkills, LocalDate.of(2019, 8, 3), "Austin"));

        return employees;
    }
}
