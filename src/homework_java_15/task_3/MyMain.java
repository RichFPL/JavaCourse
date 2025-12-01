package homework_java_15.task_3;

//Задача 3:
//Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
//оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
//Написать метод, который удаляет студентов со средним баллом <3. Если средний
//балл>=3, студент переводится на следующий курс. Дополнительно написать метод
//printStudents(List<Student> students, int course), который получает список студентов и
//номер курса. А также печатает на консоль имена тех студентов из списка, которые
//обучаются на данном курсе.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyMain {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Vlad","1",1,List.of(4,5,3,5)));
        students.add(new Student("Elizaveta","2",1,List.of(2,2,3,3)));
        students.add(new Student("Dima","2",1,List.of(4,4,4,5)));

        System.out.println("Нынешний список студентов: ");
        students.forEach(System.out::println);

        System.out.println("Обработка студентов:");
        processesStudents(students);

        System.out.println("Список студентов после обработки:");
        students.forEach(System.out::println);

       //Выводим студентов на 2-ом курсе
        printStudents(students, 2);
    }

    public static void processesStudents(List<Student> students){
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.getAverageGrades() < 3.0) {
                System.out.println("Удаление студента с баллом < 3" + student.name);
                iterator.remove();
            }else{
                student.course++;
                System.out.println("Перевод студента " + student.name + " на " + student.course + " курс.");
            }
        }
    }

    public static void printStudents(List<Student> students, int course){
        System.out.println("Студенты на " + course + " курсе: ");
        boolean found = false;
        for(Student student : students){
            if(student.course == course){
                System.out.println(student.name);
                found = true;
            }
        }
        if(!found){
            System.out.println("На данном курсе студентов нет");
        }
    }
}
