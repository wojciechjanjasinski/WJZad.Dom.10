package VehicleRental;

public interface Movable {
    String LEFT ="Skręcanie w lewo";
    String RIGHT = "Skręcanie w prawo";
    String FORWARD = "Jazda do przodu";
    String BACK = "Cofanie";
    void turnIntoDirection(String direction);

    void turnLeft();
    }
