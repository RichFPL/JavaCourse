package homework_java_15.task_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionAnimals {
    public List<String> animals = new LinkedList<>();


    public void addAnimal(String animalName){
        animals.add(0,animalName);
        System.out.println("Животное добавлено в начало " + animalName + " и ваш набор животных выглядит так:  " + animals);
    }

    public void removeLastAnimal(){
        animals.remove(animals.size() - 1);
        System.out.println("Животное удалено в конце и ваш набор животных выглядит так : " + animals);
    }

    public void displayAnimals(){
        System.out.println("Ваши животные: " + animals);
    }


}
