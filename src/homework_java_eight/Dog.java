package homework_java_eight;

public class Dog extends Animal{
    @Override
    public void voice(){
        System.out.println("Собака издаёт звук - гав.");
    }

    @Override
    public void eat(String food){
        if(food == "Meat"){
            System.out.println("Собаке нравится мясо. Она довольна.");
        }else if(food == "Grass"){
            System.out.println("Собаке не нравится есть траву. Она недовольна.");
        }else{
            System.out.println("Собака не знает какие испытывать эмоции от этой еды.");
        }
    }
}
