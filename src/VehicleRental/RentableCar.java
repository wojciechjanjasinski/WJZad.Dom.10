package VehicleRental;

public class RentableCar extends Car implements Rental, Movable {
    Person person;

    public RentableCar(String name, int yearProduction, int numberOfSeats) {
        super(name, yearProduction, numberOfSeats);
        person = new Person();
    }

    @Override
    public void rent(String firstName, String lastName, String id) {
        person = new Person(firstName, lastName, id);
        System.out.println(firstName + " " + lastName + " " + id);
    }

    @Override
    public void handOver() {
        person = null;
        System.out.println("Samochód został zwrócony");
    }

    @Override
    public boolean isRent() {
        if (person != null) {
            System.out.println("Samochód został wypożyczony");
        }
        else {
            System.out.println("Samochód znajduje się w wypożyczalni do dyspozycji");
        }
        return false;
    }

    @Override
    public String toString() {
        return "RentableCar{" +
                "person=" + person +
                "} " + super.toString();
    }

    @Override
    public void turnIntoDirection(String direction) {
        setDirectionMemory(direction);
        System.out.println(direction);

    }
}
