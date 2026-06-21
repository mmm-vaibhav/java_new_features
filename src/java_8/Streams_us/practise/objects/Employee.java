package java_8.Streams_us.practise.objects;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private double salary;
    private String gender;
    private List<String> skills;
    private LocalDate joiningDate;
    private String city;

    public Employee() {

    }

    public Employee(int id, String name, int age, String department, double salary, String gender, List<String> skills, LocalDate joiningDate, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.gender = gender;
        this.skills = skills;
        this.joiningDate = joiningDate;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Employee employee)) return false;

        return id == employee.id && age == employee.age && Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(department, employee.department) && Objects.equals(gender, employee.gender) && Objects.equals(skills, employee.skills) && Objects.equals(joiningDate, employee.joiningDate) && Objects.equals(city, employee.city);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + age;
        result = 31 * result + Objects.hashCode(department);
        result = 31 * result + Double.hashCode(salary);
        result = 31 * result + Objects.hashCode(gender);
        result = 31 * result + Objects.hashCode(skills);
        result = 31 * result + Objects.hashCode(joiningDate);
        result = 31 * result + Objects.hashCode(city);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", skills=" + skills +
                ", joiningDate=" + joiningDate +
                ", city='" + city + '\'' +
                '}';
    }
}
