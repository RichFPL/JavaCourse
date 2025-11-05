package TestHW.pc;

public class HDD {
    private final String type;
    private final String model;
    private final double capacity;


    public HDD(String type, String model, double capacity) {
        this.type = type;
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return  "\t\tType: " + type + "\n" +
                "\t\tModel: " + model + "\n" +
                "\t\tCapacity: " + capacity;
    }
}
