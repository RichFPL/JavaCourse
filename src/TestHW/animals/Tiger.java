package TestHW.animals;

public final class Tiger extends Cats{
    public Tiger(String type, String color, int age, double weight){
        super(type,color,age,weight);
    }

    @Override
    public void getCatsCall() {
        System.out.println("This is tiger call");
    }
}
