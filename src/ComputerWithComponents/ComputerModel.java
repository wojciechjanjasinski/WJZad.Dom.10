package ComputerWithComponents;

public class ComputerModel extends ComputerPatternInfo implements ComputerModelOverclockCpuAndRam {
    Processor processor;
    RamMemory ramMemory;
    HardDrive hardDrive;

    public ComputerModel(String modelName, String producerName, double serialNumber, double temperature, Processor processor, RamMemory ramMemory, HardDrive hardDrive) {
        super(modelName, producerName, serialNumber, temperature);
        this.processor = processor;
        this.ramMemory = ramMemory;
        this.hardDrive = hardDrive;
    }

    @Override
    public void overclockCpu(double overclockCpuValue) {
        for (double i = processor.getCpuClockSpeed(), j = getTemperature(); i < overclockCpuValue && j <= getHighestSecureTemperature(); i += 10, j++) {
            processor.setCpuClockSpeed(i);
            processor.setTemperature(j);
            System.out.println(i + " MHz " + j + " °C");
        }
        System.out.println("Zdecydowałeś się przyspieszyć taktowanie swojego procesora do następującej prędkości " + processor.getCpuClockSpeed() + " MHz " + " \n oprogramowanie procesora zabezpiecza go przed podnoszeniem prędkości taktowania tak, aby nie przekroczyć temperatury " + getHighestSecureTemperature() + " °C");
    }

    @Override
    public void overclockRamMemory(double overclockRamValue) {
        for (double i = ramMemory.getRamClockSpeed(), j = getTemperature(); i < overclockRamValue && j <= getHighestSecureTemperature(); i += 6.6, j++) {
            ramMemory.setRamClockSpeed(i);
            setTemperature(j);
            System.out.println(i + " MHz " + j + " °C");
        }
        System.out.println("Zdecydowałeś się przyspieszyć taktowanie swojej pamięci RAM do następującej prędkości " + ramMemory.getRamClockSpeed() + " MHz " + " \n oprogramowanie pamięci RAM zabezpiecza go przed podnoszeniem prędkości taktowania tak, aby nie przekroczyć temperatury " + getHighestSecureTemperature() + " °C");
    }

    @Override
    public String toString() {
        return "ComputerModel{" + super.toString() +
                "processor=" + processor +
                ", ramMemory=" + ramMemory +
                ", hardDrive=" + hardDrive +
                "} ";
    }
}
