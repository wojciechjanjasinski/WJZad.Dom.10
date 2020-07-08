package ComputerWithComponents;

public class Processor extends ComputerPatternInfo {
    private double cpuClockSpeed;

    public Processor(String modelName, String producerName, double serialNumber, double temperature, double cpuClockSpeed) {
        super(modelName, producerName, serialNumber, temperature);
        this.cpuClockSpeed = cpuClockSpeed;
    }

    public double getCpuClockSpeed() {
        return cpuClockSpeed;
    }

    public void setCpuClockSpeed(double cpuClockSpeed) {
        this.cpuClockSpeed = cpuClockSpeed;
    }

    @Override
    public String toString() {
        return "Processor{" + super.toString() +
                "cpuClockSpeed=" + cpuClockSpeed +
                "} ";
    }
}
