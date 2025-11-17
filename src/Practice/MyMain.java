package Practice;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args){
        practice();
    }

    public static void practice(){
        //Цель: Используйте цикл do-while, чтобы постоянно запрашивать
        // у пользователя ввод числа до тех пор, пока введенное число не совпадет с секретным.
        //Вам понадобится имитировать ввод пользователя
        // (пока без реального сканера, просто меняйте значение переменной в уме при проверке логики
        // или используйте реальный Scanner как в примере выше).
        //Объявите переменную guess (попытка угадать).
        //В блоке do { ... } "получите" число от пользователя (присвойте переменной guess какое-то значение)
        // и выведите сообщение "Попытка №X...".
        //В условии while (...) проверяйте, что guess НЕ равно secretNumber
        int money = 0;
        while(money <= 20000){
            money = money + 800;
        }
        System.out.println("Тебе понадобилось " + money/800);
        System.out.println("В годах " + 26/12);
        System.out.println("Твои деньги " + money);

    }

}
