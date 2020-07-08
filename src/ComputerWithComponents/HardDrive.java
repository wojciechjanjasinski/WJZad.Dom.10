package ComputerWithComponents;

public class HardDrive extends ComputerPatternInfo {
    private double storageCapacityVolume;

    public HardDrive(String modelName, String producerName, double serialNumber, double temperature, double storageCapacityVolume) {
        super(modelName, producerName, serialNumber, temperature);
        this.storageCapacityVolume = storageCapacityVolume;
    }

    public double getStorageCapacityVolume() {
        return storageCapacityVolume;
    }

    public void setStorageCapacityVolume(double storageCapacityVolume) {
        this.storageCapacityVolume = storageCapacityVolume;
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "storageCapacityVolume=" + storageCapacityVolume +
                "} " + super.toString();
    }
}
