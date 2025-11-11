package homework_java_12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Задача 1:
//Вывести в консоль из строки которую пользователь вводит с клавиатуры все
//аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
//только из прописных букв, без чисел.
public class MyMain {
    public static void main(String[] args){
        finderAbbreviation();
    }

    public static void finderAbbreviation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для поиска аббревиатур:");
        String inputLine = scanner.nextLine();
        scanner.close();

    }
}
