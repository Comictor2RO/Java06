package ex04;

public class Car extends Vehicle{
    private int speed;

    Car(int speed){
        super.speed = speed;
        this.speed = speed * speed;
    }

    public void printSpeeds(){
        System.out.println("Car Speed:\t" + this.speed + "\nVehicle Speed:\t" + super.speed);
    }
}
