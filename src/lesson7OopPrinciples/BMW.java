package lesson7OopPrinciples;

public class BMW extends Car{
    public BMW(String myCarModel, String myCarColor, int myProductionYear) {
        super(myCarModel, myCarColor, myProductionYear);
    }

    @Override
    public void startEngine() {
        System.out.println("BMW starts engine!");
    }

    @Override
    public void startEngine(String msg) {
        System.out.println("BMW starts engine with the following msg: " + msg);
    }
}
