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

    public void overclockCpu (double overclockCpuValue){
        for (double i = getCpuClockSpeed(), j = getTemperature(); i < overclockCpuValue && j <= getHighestSecureTemperature(); i += 10, j++) {
            setCpuClockSpeed(i);
            setTemperature(j);
            System.out.println(i + " MHz " + j + " °C");
        }
        System.out.println("Możesz przyspieszyć taktowanie swojego procesora maksymalnie do następującej prędkości " + getCpuClockSpeed() +  " MHz aby osiągnąć maksymalną bezpieczną temperaturę użytkowania procesora " + getTemperature() + " °C \n oprogramowanie procesora zabezpiecza go przed dalszym podnoszeniem prędkości taktowania, aby nie przekroczyć temperatury " + getHighestSecureTemperature() + " °C");
    }

    @Override
    public String toString() {
        return "Processor{" +
                "cpuClockSpeed=" + cpuClockSpeed +
                "} " + super.toString();
    }
}
