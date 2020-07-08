package VehicleRental;

public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(String name, int yearProduction, int numberOfSeats) {
        super(name, yearProduction);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfSeats=" + numberOfSeats +
                "} " + super.toString();
    }

    @Override
    public void turnIntoDirection(String direction) {

    }

    @Override
    public void turnLeft() {

    }
}
