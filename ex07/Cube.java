package ex07;

public class Cube extends SolidShape{
    private double width;
    
    public Cube(double width){
        if(width <= 0)
            throw new IllegalArgumentException("Width cannot be 0 or less then 0");
        this.width = width;
    }

    @Override
    public double getArea(){
        return 6 * (width * width);
    }

    @Override 
    public double getVolume(){
        return width * width * width;
    }
}
