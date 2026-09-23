package ex07;

public class Cylinder extends SolidShape{
    private double radius;
    private double height;
    private final double PI = 3.14;
    private double lateralArea;
    private double baseArea;

    Cylinder(double radius, double height){
        if(radius <= 0 || height <= 0){
            throw new IllegalArgumentException("Radius/Height cannot be less or equal to 0");
        }

        this.radius = radius;
        this.height = height;

        lateralArea = 2 * PI * height;
        baseArea = PI * (radius * radius);
    }

    @Override 
    public double getArea(){
        return lateralArea + 2 * baseArea;
    }

    @Override 
    public double getVolume(){
        return baseArea * height;
    }
}
