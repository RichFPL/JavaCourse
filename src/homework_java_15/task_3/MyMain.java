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
import java.util.List;

public class MyMain {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Vlad","Группа 1",1,List.of(4,5,3,5)));
        students.add(new Student("Elizaveta","Группа 2",1,List.of(5,5,4,4)));

    }

}
