package ex03;

public class Manager extends Employee{
    private String department;

    public Manager(String name, int age){
        super(name, age);
        this.department = "Unassigned";
    }

    public Manager(String name, int age, int employeeId) {
        super(name, age, employeeId);
        this.department = "Unassigned";
    }

    public Manager(String name, int age, int employeeId, String department) {
        super(name, age, employeeId);
        this.department = department;
    }

    public String getDepartment(){
        return department;
    }
    
}
