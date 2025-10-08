package homework_java;

import java.util.Scanner;

public class HomeworkThirdLesson {
    public static void main(String[] args) {

        getSquares();
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
    public static void getSquares(){
        int a = 10;
        int b = 11;
        int c = 12;
        int d = 13;
        int e = 14;
        int f = 15;
        int g = 16;
        int i= 17;
        int u = 18;
        int o = 19;
        int j = 20;
        Double squarerootA = Math.pow(a,0.5);
        System.out.println("The Square of a Given Number 10 = " + squarerootA);
        Double squarerootB = Math.pow(b,0.5);
        System.out.println("The Square of a Given Number 11 = " + squarerootB);
        Double squarerootC = Math.pow(c,0.5);
        System.out.println("The Square of a Given Number 12 = " + squarerootC);
        Double squarerootD = Math.pow(d,0.5);
        System.out.println("The Square of a Given Number 13 = " + squarerootD);
        Double squarerootE = Math.pow(e,0.5);
        System.out.println("The Square of a Given Number 14 = " + squarerootE);
        Double squarerootF = Math.pow(f,0.5);
        System.out.println("The Square of a Given Number 15 = " + squarerootF);
        Double squarerootG = Math.pow(g,0.5);
        System.out.println("The Square of a Given Number 16 = " + squarerootG);
        Double squarerootI = Math.pow(i,0.5);
        System.out.println("The Square of a Given Number 17 = " + squarerootI);
        Double squarerootU = Math.pow(u,0.5);
        System.out.println("The Square of a Given Number 18 = " + squarerootU);
        Double squarerootO = Math.pow(o,0.5);
        System.out.println("The Square of a Given Number 19 = " + squarerootO);
        Double squarerootJ = Math.pow(j,0.5);
        System.out.println("The Square of a Given Number 20 = " + squarerootJ);



    }
}
