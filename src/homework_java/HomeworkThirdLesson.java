package homework_java;

import java.util.Scanner;

public class HomeworkThirdLesson {
    public static void main(String[] args) {

        outdoorTemperature();
    }

    //Задача 1:
//Напишите программу, которая будет принимать на вход число из консоли и на выход
//будет выводить сообщение четное число или нет. Для определения четности числа
//используйте операцию получения остатка от деления (операция выглядит так: '% 2').
    public static void parityResult() {
        System.out.println("Please enter a number");
        Scanner resultNumber = new Scanner(System.in);
        int parity = resultNumber.nextInt();

        if ((parity % 2) == 0) {
            System.out.println("Ваше число " + parity + " чётное");
        } else {
            System.out.println("Ваше число " + parity + " нечётное");
        }
    }

    //Задача 2:
//Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
//Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».
    public static void outdoorTemperature() {
        System.out.println("Введите пожалуйста температуру на улице");
        Scanner temperature = new Scanner(System.in);
        int getTemperature = temperature.nextInt();

        if (getTemperature <= -20){
            System.out.println("Cold");
        } else if (-5 >= getTemperature && getTemperature> -20) {
            System.out.println("Normal");
        } else if (getTemperature > -5){
            System.out.println("Warm");
        }

    }
    //Задача 3:
    //Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.

}
