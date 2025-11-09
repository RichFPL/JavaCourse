package homework_java_nine.task_2;

//Задача 2:
//Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
//функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
//абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
//периметра всех фигур в массиве.

import homework_java_nine.task_2.figures.*;

public class MyMain {
    public static void main(String[] args){
        createFigure();
    }

    public static void createFigure(){
        Circle circle = new Circle(14);
        circle.getSquare();
        circle.getPerimeter();

        System.out.println("-".repeat(50));

        Rectangle rectangle = new Rectangle(10,15);
        rectangle.getSquare();
        rectangle.getPerimeter();

        System.out.println("-".repeat(50));
        Triangle triangle = new Triangle(15,10,15);
        triangle.getSquare();
        triangle.getPerimeter();

        System.out.println("-".repeat(50));
        SecondTriangle secondTriangle = new SecondTriangle(25,25,25);
        secondTriangle.getSquare();
        secondTriangle.getPerimeter();

        System.out.println("-".repeat(50));
        SecondRectangle secondRectangle = new SecondRectangle(20,15);
        secondRectangle.getSquare();
        secondRectangle.getPerimeter();

        System.out.println("-".repeat(50));

        Figures[] figure = {circle, rectangle, triangle, secondTriangle, secondRectangle};
        double sumPerimeters = 0;
        for(Figures fig : figure){
            sumPerimeters += fig.getSumPerimeters();
        }
        System.out.println("Сумма всех периметров фигур массива равна (см) : " + sumPerimeters);
    }
}
