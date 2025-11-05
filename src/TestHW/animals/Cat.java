package TestHW.animals;

public final class Cat extends Cats {
    public Cat(String type, String color, int age, double weight){
        super(type,color,age,weight);
    }

    @Override
    public void getCatsCall() {
        System.out.println("This is cat call");
    }

}
