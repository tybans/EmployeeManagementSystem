package EMPLOYEEMANAGEMENT;
public class EmployeeDetails{
    private String name;
    private String joiningDate;
    private int employeeId;
    private int salary;

    public EmployeeDetails(String eName, String eJD, int eId, int slry){
        this.name = eName;
        this.joiningDate = eJD;
        this.employeeId = eId;
        this.salary = slry;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}