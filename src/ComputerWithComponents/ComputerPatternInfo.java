package ComputerWithComponents;

public abstract class ComputerPatternInfo {
    private String modelName;
    private String producerName;
    private double serialNumber;
    private double temperature;
    private static final double HIGHEST_SECURE_TEMPERATURE = 90; // 90°C celsius degree

    public ComputerPatternInfo(String modelName, String producerName, double serialNumber, double temperature) {
        this.modelName = modelName;
        this.producerName = producerName;
        this.serialNumber = serialNumber;
        this.temperature = temperature;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public double getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(double serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public static double getHighestSecureTemperature() {
        return HIGHEST_SECURE_TEMPERATURE;
    }

    @Override
    public String toString() {
        return "ComputerPatternInfo{" +
                "modelName='" + modelName + '\'' +
                ", producerName='" + producerName + '\'' +
                ", serialNumber=" + serialNumber +
                ", temperature=" + temperature +
                '}';
    }
}
