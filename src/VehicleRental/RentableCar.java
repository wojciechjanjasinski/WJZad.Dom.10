package VehicleRental;

public class RentableCar extends Car implements Rental {
    Person person;
    public RentableCar(String name, int yearProduction, int numberOfSeats) {
        super(name, yearProduction, numberOfSeats);
    }

    @Override
    public void rent(String firstName, String lastName, String id) {
        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setId(id);
        System.out.println(firstName + lastName + id);
    }

    @Override
    public void handOver() {
        person.setFirstName(null);
        person.setLastName(null);
        person.setId(null);
        System.out.println("Samochód został zwrócony");
    }

    @Override
    public boolean isRent() {
        if (person.getFirstName() != null)
        return true;
        else System.out.println("Samochód znajduje się  wypożyczalni do dyspozycji");
        return false;
    }

    @Override
    public String toString() {
        return "RentableCar{" +
                "person=" + person +
                "} " + super.toString();
    }
}
