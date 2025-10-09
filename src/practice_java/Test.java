package practice_java;

import java.sql.SQLOutput;
import java.util.Random;

public class Test {
    public static void main(String[] args){
        useMathLibrary();

    }


    public static void useMathLibrary(){
        // Class Math - библиотека для математических операций
        // Math.____
        // Math.floor() - округляет число правильно, что с обойх сторон возможность округления было равным
        // Math.round() - округляет тупо, по простому 4.567 - 4.6
        // Math.random() - случайное число, но возвращает тип double - 0.01 по 0.9999
        // Надо знать формулу, которая будет возвращать уже целочисленное значение

        // ПОСМОТРЕТЬ: int randomNumber = (int) (Math.random() * (max - min + 1)) + min;
        for (int counter = 1; counter <= 10; counter++){
            System.out.println((int) (Math.random() * 10)); // А что если я хочу: от 101 по 201 ???
        }

        System.out.println("-".repeat(50));

        for (int helis = 10; helis <=20; helis++){
            System.out.println("Sqrt("+ helis + "): " + Math.sqrt(helis));
        }

        for (int dou = 20; dou <= 100; dou+=10) {
            System.out.println("Sum(" + dou + ") : " + Math.sqrt(dou));
        }
    }


}
