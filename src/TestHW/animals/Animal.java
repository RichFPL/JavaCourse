package TestHW.animals;

public class Animal {
    private final String type;
    private final String color;
    private final int age;
    private final double weight;
    private static int counter = 0;

    public Animal(){
        this("Beast", "Black",2,14);
    }

    private Animal(String type, String color){

        this(type, color, 2, 8);
    }

    public Animal(String type, String color, int age, double weight){
        this.type = type;
        this.color = color;
        this.age = age;
        this.weight = weight;
        counter++;
    }

    public int getCounter(){
        return counter;
    }

    public void getCatsCall(){
        System.out.println("This is cats call: ");
    }

    public static Animal viewPrivateConstructor(){
       return new Animal("Lion","Yellow");
    }

    @Override
    public String toString() {
        return "\nAnimal: " + "\n" +
                "\t\tType: " + type + "\n" +
                "\t\tColor: " + color + "\n" +
                "\t\tAge:" + age + "\n" +
                "\t\tWeight: " + weight;
    }
}
