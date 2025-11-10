package homework_java_ten;
//Задача 1:
//Создать класс для описания пользователя системы. Переопределить в классе методы
//toString,hashcode и equals. Создать несколько экземпляров класса с одним и тем же
//значением полей и сравнить с помощью метода equals.
public class MyMain {
    public static void main(String[] args) {
        createPerson();
    }

    public static void createPerson(){
        Person person = new Person("John","Fabos","Java-developer",24);
        Person person2 = new Person("John","Fabos","Java-developer",24);
        Person person3 = new Person("John","Fabos","Java-developer",24);
        System.out.println("Переопределённый метод toString:");
        System.out.println(person);

        System.out.println("-".repeat(50));
        System.out.println("Переопределённый метод hashCode: ");
        int hashCode = person.hashCode();
        System.out.println("Хэш код объекта: " + hashCode);

        System.out.println("-".repeat(50));
        System.out.println("Переопределенный метода equals: ");
        System.out.println("Сравнение person и person2 : ");
        boolean equal = person.equals(person2);
        System.out.println(equal);
        System.out.println("Сравнение person2 и person3: ");
        boolean equalTwo = person2.equals(person3);
        System.out.println(equalTwo);

        System.out.println("-".repeat(50));


    }

}
