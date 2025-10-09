package homework_java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeworkThirdLesson {
    public static void main(String[] args) {

        parityResult();
        outdoorTemperature();
        getSquares();
        getSumNumber();
    }

    //Задача 1:
//Напишите программу, которая будет принимать на вход число из консоли и на выход
//будет выводить сообщение четное число или нет. Для определения четности числа
//используйте операцию получения остатка от деления (операция выглядит так: '% 2').
    public static void parityResult() {
        System.out.println("Пожалуйста, введите число, для определения его чётности");
        Scanner resultNumber = new Scanner(System.in);
        int parity = resultNumber.nextInt();

        if ((parity % 2) == 0) {
            System.out.println("Ваше число " + parity + " - чётное");
        } else {
            System.out.println("Ваше число " + parity + " - нечётное");
        }
        System.out.println("-".repeat(50));
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
        System.out.println("-".repeat(50));

    }
    //Задача 3:
    //Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
    public static void getSquares(){
        int degree = 2;
        for (int squares = 10; squares <= 20; squares++){
            System.out.println("Квадрат ("+ squares +") :" + Math.pow(squares, degree));
        }
        System.out.println("-".repeat(50));
    }
    //Задача 4:
    //Необходимо, чтоб программа выводила на экран вот такую последовательность:
    //7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.
    public static void  getCycle(){
        int cycle = 7;
        while( cycle <=98){
            System.out.println(cycle);
            cycle = cycle + 7;
        }
        System.out.println("-".repeat(50));
    }
    //Задача *:
    //Напишите программу, где пользователь вводит любое целое положительное число. А
    //программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
    //числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
    //ввести некорректные данные.
    public static void getSumNumber(){
        Scanner sumNumber = new Scanner(System.in);
        System.out.println("Введите пожалуйста любое целое положительное число от 1 : ");
        int result = 0;

        if(sumNumber.hasNextInt()){
            int a = sumNumber.nextInt();
            if (a >= 1){
                System.out.println("Вы ввели число " + a );
            }else if(a<1){
                System.out.println("Вы ввели некоректное число");
                return;
            }
            for (int b = 1; b<=a; b++){
                result+=b;
            }
            System.out.println("Сумма всех чисел от 1 до " + a + " равна " + result );
        }
    }
}
