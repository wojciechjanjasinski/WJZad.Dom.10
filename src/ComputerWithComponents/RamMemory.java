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

    public void overclockRamMemory (double overclockRamValue){
        for (double i = getRamClockSpeed(), j = getTemperature(); i < overclockRamValue && j <= getHighestSecureTemperature(); i += 6.6, j++) {
            setRamClockSpeed(i);
            setTemperature(j);
            System.out.println(i + " MHz " + j + " °C");
        }
        System.out.println("Możesz przyspieszyć taktowanie swojej pamięci RAM maksymalnie do następującej prędkości " + getRamClockSpeed() +  " MHz aby osiągnąć maksymalną bezpieczną temperaturę użytkowania pamięci RAM " + getTemperature() + " °C \n oprogramowanie pamięci RAM zabezpiecza ją przed dalszym podnoszeniem prędkości taktowania, aby nie przekroczyć temperatury " + getHighestSecureTemperature() + " °C");
    }

    @Override
    public String toString() {
        return "RamMemory{" +
                "ramMemoryVolume=" + ramMemoryVolume +
                ", ramClockSpeed=" + ramClockSpeed +
                "} " + super.toString();
    }
}
