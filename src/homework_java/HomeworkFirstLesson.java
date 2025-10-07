package homework_java;

public class HomeworkFirstLesson {
    public static void main(String[] args) {
        System.out.println("Домашнее задание по первому занятию");
        System.out.println("");

        getEquation();
        getSumDigits();
        getSumDigitsTwo();
        getRounding();
        getDivison();
        getReplacement();
    }
//Задача 1:
//Написать приложение, которое будет вычислять и выводить значение по формуле:
//a=4*(b+c-1)/2; b и c задаем в коде самостоятельно.
    public static void getEquation(){
        int b = 15;
        int c = 200;
        double a = 4*(b+c-1)/2;
        System.out.println("Task #1");
        System.out.println("A = " + a);
        System.out.println("");
    }
//Задача 2:
//В переменной n хранится двузначное число. Создайте программу, вычисляющую и
//выводящую на экран сумму цифр n. Например: n =26, в результате мы должны получить 8(2+6).
    public static void getSumDigits() {
        int f = 5;
        int k = 7;

        double sumDigits = f + k;
        System.out.println("Task #2");
        System.out.println("Сумма цифр n = " + sumDigits);
        System.out.println("");

    }
//Задача 3:
//В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
//выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить
//9 (1+2+6).
    public static void getSumDigitsTwo(){
        int h = 4;
        int l = 2;
        int j = 9;
        double sumDigitsTwo = h + l + j;
        System.out.println("Task #3");
        System.out.println("Сумма трёх чисел = " + sumDigitsTwo);
        System.out.println("");

    }
//Задача 4:
//В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
//программу, округляющую число n до ближайшего целого и выводящую результат на экран.
    public static void getRounding(){
        double realNumber = 387.7874389;
        int roundingNumber = (int)realNumber;
        System.out.println("Task #4 ");
        System.out.println("Округление вещественного числа до ближайшего целого = " + roundingNumber);
        System.out.println("");

    }
// Задача 5:
//В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
//на экран результат деления q на w с остатком. Пример вывода программы (для случая,
//когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.
    public static void getDivison(){
       int u = 21;
       int y = 8;
       int divisionResult = 21 % 8;
       System.out.println("Task #5 ");
       System.out.println("Результат деления с остатком = " + divisionResult);
       System.out.println("");

    }
//Задача *:
//Написать программу которая будет менять местами значение целочисленных
//переменных. Пример:
//int a = 1; int b = 2;
//sout(a); //выведет 2
//sout(b); //выведет 1
//Усовершенствовать программу , использовать только 2 входные переменные.
    public static void getReplacement(){
        int ab = 1;
        int ac = 2;
        ab = ab + ac;
        ac = ab - ac;
        ab = ab - ac;
        System.out.println("Task #6");
        System.out.println("Меняем местами вывод значения переменных, с помощью изменения их значений, при помощи арифметических операторов");
        System.out.println("ab = " + ab);
        System.out.println("ac = " + ac);
    }
}
