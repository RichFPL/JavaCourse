package homework_java_eight;

//Задача 1:
//Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
//Переопределить методы voice(), eat(String food) чтобы они выводили верную
//информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
//Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
//туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
//или другую строку то он будет недоволен.

public class MyMain {
    public static void main(String[]args){
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Rabbit rabbit = new Rabbit();

        dog.voice();
        dog.eat("Meat");
        dog.eat("Grass");
        dog.eat("Earth");

        System.out.println("-".repeat(50));
        tiger.voice();
        tiger.eat("Meat");
        tiger.eat("Grass");
        tiger.eat("Earth");

        System.out.println("-".repeat(50));
        rabbit.voice();
        rabbit.eat("Meat");
        rabbit.eat("Grass");
        rabbit.eat("Earth");


    }
}
