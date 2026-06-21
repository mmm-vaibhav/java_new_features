package java_17.records;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee(7785, "Scott", 5000.54);
        System.out.println(employee);
        System.out.println("==========Getters============");
        System.out.println(employee.empName());

        Employee employee1 = new Employee(7705, "Darwin", 5000.54);
        System.out.println("==========equals============");
        System.out.println(employee1.equals(employee));
    }
}
