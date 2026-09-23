package ex07;

public class Shapes3DTest {
    public static void main(String[] args) {
        SolidShape cube = new Cube(5);
        SolidShape cylinder = new Cylinder(10, 20);

        System.out.println("---Cube Values---");
        System.out.println("Area:\t" + cube.getArea());
        System.out.println("Volume:\t" + cube.getVolume());

        System.out.println("---Cylinder Values---");
        System.out.println("Area:\t" + cylinder.getArea());
        System.out.println("Volume:\t" + cylinder.getVolume());
        
        /*
            Iti da eroare pentru ca Shape nu are getVolume. 

            Shape cube = new Cube(5);
            Shape cylinder = new Cylinder(10, 20);

            System.out.println("---Cube Values---");
            System.out.println("Area:\t" + cube.getArea());
            System.out.println("Volume:\t" + cube.getVolume());

            System.out.println("---Cylinder Values---");
            System.out.println("Area:\t" + cylinder.getArea());
            System.out.println("Volume:\t" + cylinder.getVolume());
        */
    }
}
