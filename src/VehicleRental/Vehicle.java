package VehicleRental;

abstract class Vehicle implements Movable {
    private String name;
    private int yearProduction;

    public Vehicle(String name, int yearProduction) {
        this.name = name;
        this.yearProduction = yearProduction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", yearProduction=" + yearProduction +
                '}';
    }
}
