package homework_java_17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyMain {
    public static void main(String[] args){
        System.out.println("Первая задача: ");
        getDate();

        System.out.println("-".repeat(50));
        System.out.println("Вторая задача: ");
        //Для второй задачи:
        Integer[] numbersArray = {10, -5, 0, 42, -99, 3, -1, 500};
        List<Integer> numbersList = Arrays.asList(numbersArray);
        Predicate<Integer> isPositive = number -> number > 0;
        List<Integer> positiveNumbers = filterNumbers(numbersList, isPositive);
        System.out.println("Исходный список: " + numbersList);
        System.out.println("Положительные числа: " + positiveNumbers);
        System.out.println("50".repeat(50));
        //3-я задача:
        System.out.println("Третья задача: ");
        getMoney();
        System.out.println("50".repeat(50));
        //4-я задача
        System.out.println("Четвёртая задача: ");
        getMoreDollars();
        System.out.println("50".repeat(50));
        //5-я задача
        System.out.println("Пятая задача: ");
        reverse();


    }

    //Задача 1:
    //Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
    //когда пользователю исполнится 100 лет. Использовать Date/Time API.

    public static void getDate(){
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Введите дату своего рождения в формате ДД.ММ.ГГГГ(Например 25.05.1995: ");
        String userInput = scanner.nextLine();


        try{
            LocalDate birthDate = LocalDate.parse(userInput,formatter);
            LocalDate centuryDate = birthDate.plusYears(100);
            System.out.println("Дата вашего рождения : " + birthDate.format(formatter));
            System.out.println("Дата когда вам исполнится 100 лет : " + centuryDate.format(formatter));
        }catch(DateTimeParseException e){
            System.out.println("\nОшибка: Неверный формат даты.");
            System.out.println("Пожалуйста, используйте формат ДД.ММ.ГГГГ.");
        }
    }

    //Задача 2:
    //Используя Predicate среди массива чисел вывести только те, которые являются
    //положительными
    public static List<Integer> filterNumbers(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();

        for (Integer number : list) {
            if (predicate.test(number)) {
                result.add(number);
            }
        }
        return result;
    }

    //Задача 3:
    //Используя Function реализовать лямбду, которая будет принимать в себя строку в
    //формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
    //возвращать сумму, переведенную сразу в доллары.

    public static void getMoney(){
        final double EXCHANGE_RATE_BYN_TO_USD = 3.2;
        String inputString = "150 BYN";

        Function<String, Double> convertBynToUsd = bynString -> {
            String amountStr = bynString.split(" ")[0];
            double bynAmount = Double.parseDouble(amountStr);

            double usdAmount = bynAmount / EXCHANGE_RATE_BYN_TO_USD;

            return usdAmount;
        };

        Double resultInUsd = convertBynToUsd.apply(inputString);

        System.out.println("Исходная строка: " + inputString);
        System.out.println("Курс обмена (1 USD): " + EXCHANGE_RATE_BYN_TO_USD + " BYN");
        System.out.println(String.format("Сумма в долларах: %.2f USD", resultInUsd));

        String inputString2 = "1000 BYN";
        Double resultInUsd2 = convertBynToUsd.apply(inputString2);
        System.out.println(String.format("Сумма в долларах (1000 BYN): %.2f USD", resultInUsd2));
    }

    //Задача 4:
    //Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
    //формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
    //выводить сумму, переведенную сразу в доллары.

    public static void getMoreDollars(){
        final double EXCHANGE_RATE_BYN_TO_USD = 3.2;
        String inputString1 = "200 BYN";
        String inputString2 = "55 BYN";

        Consumer<String> printBynAsUsd = bynString -> {
            try {
                String amountStr = bynString.split(" ")[0];
                double bynAmount = Double.parseDouble(amountStr);

                double usdAmount = bynAmount / EXCHANGE_RATE_BYN_TO_USD;
                System.out.println(String.format("Сумма: %.2f BYN -> %.2f USD", bynAmount, usdAmount));

            } catch (NumberFormatException e) {
                System.out.println("Ошибка формата ввода: " + bynString);
            }
        };

        System.out.println("--- Конвертация ---");
        printBynAsUsd.accept(inputString1);
        printBynAsUsd.accept(inputString2);
    }

    //Задача 5:
    //Используя Supplier написать метод, который будет возвращать введенную с консоли
    //строку задом наперед.

    public static void reverse(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для переворачивания:");
        String input = scanner.nextLine();

        scanner.close();

        Supplier<String> reversedStringSupplier = () -> {
            StringBuilder sb = new StringBuilder(input);
            return sb.reverse().toString();
        };

        String result = reversedStringSupplier.get();
        System.out.println("Исходная строка: " + input);
        System.out.println("Строка задом наперед :  " + result);
    }
}
