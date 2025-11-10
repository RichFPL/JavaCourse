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
        shortAndLongLine();
    }
    //1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
    //найденные строки и их длину.
    public static void shortAndLongLine(){
        Scanner scanner = new Scanner(System.in);
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



}
