package EMPLOYEEMANAGEMENT;

//import javax.xml.transform.Source;

public class MainProgram {
    public static void main(String[] args) {
        TechEmployee t1 = new TechEmployee("Taiyab", "1st April", 102, 50000);
        t1.setShifts(0);
        t1.setTechSkills("Java");

        System.out.println("Tech Employee details: ");
        
        System.out.print(t1.getName() + ", ");
        System.out.print(t1.getEmployeeId()+", ");
        System.out.print(t1.getJoiningDate()+", ");
        System.out.println(t1.getSalary()+", ");
        System.out.println("The shift is currently " + t1.getShifts()+", ");
        System.out.println("This Employee has the skills of " + t1.getTechSkills());
        System.out.println();

        System.out.println("Sales Employee details: ");

        SalesEmployee salesObj = new SalesEmployee("Shubham", "2nd April", 103, 50000);
        salesObj.setTarget(99);
        salesObj.setDeadLine("30th April");
        salesObj.setConversion(101);

        System.out.print(salesObj.getName()+", ");
        System.out.print(salesObj.getEmployeeId()+", ");
        System.out.print(salesObj.getJoiningDate()+", ");
        System.out.println(salesObj.getSalary()+", ");
        System.out.println(salesObj.getTarget());
        System.out.println(salesObj.getDeadLine());
        System.out.println(salesObj.getConversion());
        System.out.println("Your performance is: " + salesObj.Performance());

    }
}
