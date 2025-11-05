package TestHW.pc;


public class PersonalComputer {
    private final PCBlock block;
    private final BaseBoard baseBoard;
    private final Processor processor;
    private final RAM ram;
    private final Cooler cooler;
    private final HDD hdd;
    private final VGA vga;

    public PersonalComputer(PCBlock block, BaseBoard baseBoard, Processor processor,
                            RAM ram, Cooler cooler, HDD hdd, VGA vga) {
        this.block = block;
        this.baseBoard = baseBoard;
        this.processor = processor;
        this.ram = ram;
        this.cooler = cooler;
        this.hdd = hdd;
        this.vga = vga;
    }

    @Override
    public String toString() {
        return "PC:\n" +
                "\tBlock:\n" + block + "\n" +
                "\tBaseBoard:\n" + baseBoard + "\n" +
                "\tProcessor:\n" + processor +"\n" +
                "\tRAM:\n" + ram +"\n" +
                "\tCooler:\n" + cooler +"\n" +
                "\tHDD:\n" + hdd +"\n" +
                "\tVGA:\n" + vga +
                '}';
    }
}
