package ex03;

public class Employee extends Person{
    private static int nextEmployerID = 1;
    protected int employerID;
    
    Employee(String name, int age){
        super(name, age);
        this.employerID = nextEmployerID++;
    }

    public Employee(String name, int age, int employerId) {
        super(name, age);
        this.employerID = employerId;
        if (employerId >= nextEmployerID) {
            nextEmployerID = employerId + 1;
        }
    }
}
