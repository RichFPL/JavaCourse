package TestHW;

import TestHW.animals.Animal;
import TestHW.animals.Cats;
import TestHW.animals.Lion;
import TestHW.pc.*;

public class MyMain {
    public static void main(String[]args){

        createNestedAnimals();

    }

    public static void createNestedAnimals(){
        Cats cat = new Cats("Cats","Yellow",23,14);
        cat.getCatsCall();
    }

    public static void createZoo() {
        Animal[] zoo = new Animal[]{
                new Animal("Lion", "White", 3, 12.5),
                new Animal("Wolf","Black",4,15),
        };

        for(Animal animal : zoo){
            System.out.println(animal);
        }

        System.out.println("How many animals:" +zoo[0].getCounter());
    }

    public static void createAnimal(){
        Animal animal = new Animal();
        Animal privateAnimal = Animal.viewPrivateConstructor();
        System.out.println(privateAnimal);
    }



    public static void composedPC(){
        PersonalComputer myPC = new PersonalComputer(
                new PCBlock("Dragon","Yellow", 2),
                new BaseBoard("Game","ASUS",4),
                new Processor("Intel", 6,4.5),
                new RAM("HyperX","Game",50),
                new Cooler("Speed",30,300),
                new HDD("HARD","HyperX",100),
                new VGA("Rade","42FD21",16,new String[]{"SLOT-1 EMPTY","SLOT-2 EMPTY"})
        );

        System.out.println(myPC);
    }

}

