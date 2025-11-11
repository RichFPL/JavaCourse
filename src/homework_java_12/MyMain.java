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
        System.out.println("Введите строку для поиска аббревиатуры:");
        String inputLine = scanner.nextLine();
        //"[0-9]{2,4}");

        Pattern pattern = Pattern.compile("[a-zа-я]{2,6}");
        Matcher matcher = pattern.matcher(inputLine);

        boolean found = false;

        StringBuilder results = new StringBuilder();

        while (matcher.find()) {
            results.append(matcher.group()).append("\n");
            found = true;
        }

        if (found) {
            System.out.println("Найденные аббревиатуры:");
            System.out.println(results.toString());
        } else {
            System.out.println("Аббревиатуры, соответствующие критериям, не найдены.");
        }
    }
}
