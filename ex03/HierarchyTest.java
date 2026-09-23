package ex03;

public class HierarchyTest {
    public static void main(String[] args) {
        Person p = new Person("Alice", 25);
        Employee e = new Employee("Bob", 30);
        Employee e1 = new Employee("Gabi", 32);
        Employee e2 = new Employee("Ana", 29);
        Manager m = new Manager("Carol", 35, 1002, "IT");
        Manager m1 = new Manager("John", 39);

        System.out.println(p.name + " - " + p.age);
        System.out.println(e.name + " - " + e.age + " - ID: " + e.employerID);
        System.out.println(e1.name + " - " + e1.age + " - ID: " + e1.employerID);
        System.out.println(e2.name + " - " + e2.age + " - ID: " + e2.employerID);
        System.out.println(m.name + " - " + m.age + " - ID: " + m.employerID + " - Dept: " + m.getDepartment());
        System.out.println(m1.name + " - " + m1.age + " - ID: " + m1.employerID + " - Dept: " + m1.getDepartment());
    }
}
