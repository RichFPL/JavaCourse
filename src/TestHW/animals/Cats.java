package TestHW.animals;

public class Cats extends Animal {
    public Cats(String type, String color, int age, double weight){
        super(type,color,age,weight);
    }

    @Override
    public void getCatsCall() {
        System.out.println("CATS CALL");
    }
}
