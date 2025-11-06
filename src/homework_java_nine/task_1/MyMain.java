package homework_java_nine.task_1;
//Задача 1:
//Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
//который печатает название должности и имплементировать этот метод в созданные
//классы.
public class MyMain {
    public static void main(String[] args){
        Accountant accountant = new Accountant();
        Director director = new Director();
        Worker worker = new Worker();

        accountant.title();
        director.title();
        worker.title();
    }
}
