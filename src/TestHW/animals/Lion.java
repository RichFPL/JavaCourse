package TestHW.animals;

public final class Lion extends Cats{
    public Lion(String type, String color, int age, double weight){
        super(type,color,age,weight);
    }

    @Override
    public void getCatsCall() {
        System.out.println("This is lion call");
    }
}
