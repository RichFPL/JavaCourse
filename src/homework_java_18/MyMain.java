package homework_java_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Задача 1:
//Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
//Stream'ов:
//- Удалить дубликаты
//- Оставить только четные элементы
//- Вывести сумму оставшихся элементов в стриме

public class MyMain {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>(Arrays.asList(
                5, 1, 2, 3, 5, 4, 2, 1, 8, 8, 9, 10
        ));

        System.out.println("Исходный список: " + numbers);

        int sumOfRemainingElements = numbers.stream()
                .distinct()
                .filter(number -> number % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("---");
        System.out.println("Сумма оставшихся уникальных четных элементов: " + sumOfRemainingElements);

        List<Integer> finalFilteredList = numbers.stream()
                .distinct()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Итоговый список элементов: " + finalFilteredList);
    }
}
