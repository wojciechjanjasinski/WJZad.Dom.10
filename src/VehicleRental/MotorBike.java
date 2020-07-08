package VehicleRental;

public class MotorBike extends Vehicle {
    private double speedLimit;

    public MotorBike(String name, int yearProduction, double speedLimit) {
        super(name, yearProduction);
        this.speedLimit = speedLimit;
    }

    public double getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(double speedLimit) {
        this.speedLimit = speedLimit;
    }

    @Override
    public String toString() {
        return "MotorBike{" +
                "speedLimit=" + speedLimit +
                "} " + super.toString();
    }


    @Override
    public void turnIntoDirection(String direction) {

    }

    @Override
    public void turnLeft() {

    }
}
