package OCP;

public class Car extends Vehicle {
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }
}