package java_8.Streams_us.misc.service;

public class EMpTest {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
//        employeeService.fetchEmployeeByDept("sales");

//        employeeService.maxPaidEmp();
//        employeeService.secondHighestPaidEmp();
//        employeeService.groupByDept();
//        employeeService.numberofEmplByDept();
//        employeeService.avgSalaryByDept();
//        employeeService.avgSalary();
        employeeService.filterEmplyeeBySal(3000.0);
        employeeService.filterEmplyeeBySal1(3000.0);
    }
}
