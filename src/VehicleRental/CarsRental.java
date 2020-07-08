package VehicleRental;

public class CarsRental {
    public static void main(String[] args) {
        RentableCar[] rentableCars = new RentableCar[2];
        rentableCars[0] = new RentableCar("Zord", 1948, 4);
        rentableCars[1] = new RentableCar("Air Bell", 1950, 5);

        rentableCars[0].rent("Anna", "Kadzidło", "33");
        rentableCars[1].rent("Henryk", "Hammerstein", "56");

        rentableCars[0].isRent();
        rentableCars[0].isRent();
        rentableCars[0].handOver();
        rentableCars[0].isRent();
        rentableCars[1].isRent();

        rentableCars[0].goBack();

    }
}
