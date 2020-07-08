package ComputerWithComponents;

public class RamMemory extends ComputerPatternInfo {
    private double ramMemoryVolume;
    private double ramClockSpeed;

    public RamMemory(String modelName, String producerName, double serialNumber, double temperature, double ramMemoryVolume, double ramClockSpeed) {
        super(modelName, producerName, serialNumber, temperature);
        this.ramMemoryVolume = ramMemoryVolume;
        this.ramClockSpeed = ramClockSpeed;
    }

    public double getRamMemoryVolume() {
        return ramMemoryVolume;
    }

    public void setRamMemoryVolume(double ramMemoryVolume) {
        this.ramMemoryVolume = ramMemoryVolume;
    }

    public double getRamClockSpeed() {
        return ramClockSpeed;
    }

    public void setRamClockSpeed(double ramClockSpeed) {
        this.ramClockSpeed = ramClockSpeed;
    }

    @Override
    public String toString() {
        return "RamMemory{" + super.toString() +
                "ramMemoryVolume=" + ramMemoryVolume +
                ", ramClockSpeed=" + ramClockSpeed +
                "} ";
    }
}
