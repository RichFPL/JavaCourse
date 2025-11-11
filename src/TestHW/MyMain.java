package TestHW;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Задача 1:
//Вывести в консоль из строки которую пользователь вводит с клавиатуры все
//аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
//только из прописных букв, без чисел.
public class MyMain {
    public static void main(String[] args) {
        finderAbbreviation();
    }

    public static void finderAbbreviation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку :");

        String text = scanner.nextLine();
        String patternText = "\\b[a-zа-яё]{2,4}\\b";

        Pattern pattern = Pattern.compile(patternText, Pattern.UNICODE_CHARACTER_CLASS);
        Matcher matcher = pattern.matcher(text);

        boolean find = false;

        StringBuilder results = new StringBuilder();

        while(matcher.find()){
            results.append(matcher.group()).append("\n");
            find = true;
        }

        if (find){
            System.out.println("Ваши аббревиатуры");
            System.out.println(results.toString());
        }else{
            System.out.println("Нет аббревиатур");
        }
    }
}