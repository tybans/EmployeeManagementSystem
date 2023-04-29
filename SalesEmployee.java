package EMPLOYEEMANAGEMENT;
public class SalesEmployee extends EmployeeDetails{
    private int target;
    private String deadLine;
    private int conversion;

    SalesEmployee(String eName, String eJD, int eId, int slry){
        super(eName, eJD, eId, slry);

    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    public int getConversion() {
        return conversion;
    }

    public void setConversion(int conversion) {
        this.conversion = conversion;
    }
    public String Performance(){
        if(getConversion()>getTarget()){
            return "Excellent!! Target over achieved";
        }
        else if(getConversion()==getTarget()){
            return "Target Achieved.";
        }
        else {
        return "Target not Achieved!";
        }
    }
    
    
}
