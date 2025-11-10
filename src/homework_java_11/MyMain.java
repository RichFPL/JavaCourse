package homework_java_11;

import java.util.Scanner;
//1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
//найденные строки и их длину.
//2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
//значений их длины.
//3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
//средней, а также их длину.
//4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
//Если таких слов несколько, найти первое из них.
//5. Вывести на консоль новую строку, которой задублирована каждая буква из
//начальной строки. Например, "Hello" -> "HHeelllloo".
public class MyMain {
    public static void main(String[] args){
        getAverageLengthString();
    }
    //1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
    //найденные строки и их длину.
    public static void shortAndLongLine(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1 ");
        System.out.println("Введите 3 слова : ");
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        String string3 = scanner.nextLine();
        System.out.println("Вы ввели : " + string1 + ", " + string2 + ", " + string3 + ".");
        if(string1.length() < string2.length() && string1.length()< string3.length()){
            System.out.println("Самая короткая строка: " + "\n" + string1 + " - её длина составляет " + string1.length());
        }else if(string2.length() < string1.length() && string2.length() < string3.length()){
            System.out.println("Самая короткая строка: " + "\n" + string2 + " - её длина составляет " + string2.length());
        }else if(string3.length() < string1.length() && string3.length() < string2.length()){
            System.out.println("Самая короткая строка: " + "\n" + string3 + " - её длина составляет " + string3.length());
        }

        if(string1.length() > string2.length() && string1.length()> string3.length()){
            System.out.println("Самая длинная строка: " + "\n" + string1 + " - её длина составляет " + string1.length());
        }else if(string2.length() > string1.length() && string2.length() > string3.length()){
            System.out.println("Самая длинная строка: " + "\n" + string2 + " - её длина составляет " + string2.length());
        }else if(string3.length() > string1.length() && string3.length() > string2.length()){
            System.out.println("Самая длинная строка: " + "\n" + string3 + " - её длина составляет " + string3.length());
        }

        System.out.println("-".repeat(50));
    }

    //2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
    //значений их длины.
    public static void getAscendingOrder(){
        String[] string = new String[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 2");
        System.out.println("Введите 3 слова : ");
        for(int i = 0; i < 3; i++){
            string[i] = scanner.nextLine();
        }
        for(int i = string.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( string[j].length() > string[j+1].length() ){
                    String tmp = string[j];
                    string[j] = string[j+1];
                    string[j+1] = tmp;
                }
            }
        }
        for(int i = 0; i < string.length; i++){
            System.out.println(string[i]);
        }
        System.out.println("-".repeat(50));
    }

    //3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
//средней, а также их длину.

    public static void getAverageLengthString(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 3");
        System.out.println("Введите 3 слова : ");
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        String string3 = scanner.nextLine();
        int string1Length = string1.length();
        int string2Length = string2.length();
        int string3Length = string3.length();
        int averageLength = (string1Length + string2Length + string2Length)/3;
        System.out.println("Строки, длина которых меньше средней: " + averageLength);
        if(string1Length < averageLength){
            System.out.println(string1);
        }
        if(string2Length < averageLength){
            System.out.println(string2);
        }
        if(string3Length < averageLength){
            System.out.println(string3);
        }

    }
}
