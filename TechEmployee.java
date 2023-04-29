package EMPLOYEEMANAGEMENT;
public class TechEmployee extends EmployeeDetails {
    private int shifts;
    private String techSkills;
    
   TechEmployee(String eName, String eJD, int eId, int slry){
    super(eName, eJD, eId, slry);
    
   }

    public String getShifts() {
        if(shifts==1){
            return "Night";

        }else if(shifts==0){
            return "Day";

        }else{
            return "Invalid Input";

        }
        //return shifts;
    }

    public void setShifts(int shifts) {
        this.shifts = shifts;
    }

    public String getTechSkills() {
        return techSkills;
    }

    public void setTechSkills(String techSkills) {
        this.techSkills = techSkills;
    } 
}
