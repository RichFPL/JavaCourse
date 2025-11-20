package homework_java_15.task_2;

//Задача 2:
//Создать класс, который будет хранить в себе коллекцию с названиями животных.
//Реализовать методы удаления и добавления животных по следующим правилам:
//добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
//объекта этого класса в main методе другого класса.

public class MyMain {
    public static void main(String[] args){
        createAnimal();
    }

    public static void createAnimal(){
        CollectionAnimals animal = new CollectionAnimals();
        animal.addAnimal("Tiger");
        animal.addAnimal("Lion");
        animal.displayAnimals();
        animal.removeLastAnimal();
        animal.addAnimal("Wolf");
        animal.addAnimal("Dog");
        animal.displayAnimals();
        animal.removeLastAnimal();
        animal.displayAnimals();
    }
}
