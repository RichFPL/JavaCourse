package TestHW;

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
        String msg = "сын";
        Pattern pattern = Pattern.compile(("\\b[а-я]{3}\\b"));
        Matcher matcher = pattern.matcher(msg);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
