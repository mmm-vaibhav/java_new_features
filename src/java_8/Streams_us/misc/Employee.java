package java_8.Streams_us.misc;

import java.util.Objects;

public class Employee {

    private Integer empno;
    private String empname;
    private Double sal;
    private String dept;

    public Employee(Integer empno, String empname, Double sal, String dept) {
        this.empno = empno;
        this.empname = empname;
        this.sal = sal;
        this.dept = dept;
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;
        return Objects.equals(empno, employee.empno) && Objects.equals(empname, employee.empname) && Objects.equals(sal, employee.sal) && Objects.equals(dept, employee.dept);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(empno);
        result = 31 * result + Objects.hashCode(empname);
        result = 31 * result + Objects.hashCode(sal);
        result = 31 * result + Objects.hashCode(dept);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dept='" + dept + '\'' +
                ", sal=" + sal +
                ", empname='" + empname + '\'' +
                ", empno='" + empno + '\'' +
                '}';
    }
}
