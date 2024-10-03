import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private String lastname;
    private Integer employeeFile;
    private Double salary;

    public Employee(String name, String lastname, Integer employeeFile, Double salary) {
        this.name = name;
        this.lastname = lastname;
        this.employeeFile = employeeFile;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getEmployeeFile() {
        return employeeFile;
    }

    public void setEmployeeFile(Integer employeeFile) {
        this.employeeFile = employeeFile;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + "," + lastname + "," + employeeFile + "," + salary;
    }
}
