package VehicleRental;

public interface Rental {
    void rent(String firstName, String lastName, String id);

    void handOver();

    boolean isRent();
}
