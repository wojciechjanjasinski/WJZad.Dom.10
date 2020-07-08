package ComputerWithComponents;

public class TestProcessor {
    public static void main(String[] args) {
        Processor processor = new Processor("Dark Lake", "DMD", 303, 25, 2000);
        processor.overclockCpu(6000);
    }
}
