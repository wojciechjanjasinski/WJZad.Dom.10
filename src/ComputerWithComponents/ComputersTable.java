package ComputerWithComponents;

public class ComputersTable {
    public static void main(String[] args) {
        ComputerModel[] computerModels = new ComputerModel[2];
        computerModels[0] = new ComputerModel("DFX-1001", "Zell", 3456, 25, new Processor("Dark Lake", "Zell", 123, 25, 2000), new RamMemory("Zord001", "Zell", 987, 25, 4000, 4000), new HardDrive("HK-001", "Hakkuda", 34567, 25, 5555));
        computerModels[1] = new ComputerModel("DFX-1002", "Zeld", 6567, 27, new Processor("White Lake", "Bell365", 123678, 27, 4000), new RamMemory("Zord002", "Zell", 988, 27, 6000, 7000), new HardDrive("AFD-003", "Zasad", 12343, 25, 3333));

        System.out.println(computerModels[0].toString());
        computerModels[0].overclockCpu(8000);
        computerModels[0].overclockRamMemory(8000);

        System.out.println(computerModels[1].toString());
        computerModels[1].overclockCpu(7900);
        computerModels[1].overclockRamMemory(7900);
    }
}
