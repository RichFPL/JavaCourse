package homework_java;


import java.util.Arrays;
import java.util.Scanner;

public class HomeworkFourLessonFourthLesson {
    public static void main(String[] args) {
        getRemoval();

    }
    //Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер
    //массива (просто целое число). После того, как размер массива задан, заполнить его
    //одним из двух способов: используя Math.random(), или каждый элемент массива вводится
    //пользователем вручную. Попробовать оба варианта. После заполнения массива
    //данными, решить для него следующие задачи:


    public static void getRemoval() {
        Scanner numberScanner = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int importNumbers = numberScanner.nextInt();
        int[] array = new int[importNumbers];
        System.out.println("Ваш массив состоит из " + importNumbers + " элементов");

        for (int index = 0; index < array.length; index++) {
            array[index] = ((int) (Math.random() * 10));
        }

        System.out.println("-".repeat(50));

        //Задача 1:
        //Пройти по массиву, вывести все элементы в прямом и в обратном порядке
        System.out.println("Массив в прямом порядке: ");
        for (int counter = 0; counter < array.length; counter++) {
            System.out.println(array[counter]);
        }

        System.out.println("Массив в обратном порядке");
        for (int reverse = array.length - 1; reverse >= 0; reverse--) {
            System.out.println(array[reverse]);
        }

        System.out.println("-".repeat(50));

        //Задача 2:
        //Найти минимальный-максимальный элементы и вывести в консоль.

        int max = array[0];
        for(int i = 0; i< array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println("Значение максимального элемента массива: " + max);

        int min = array[0];
        for(int b = 0; b< array.length;b++){
            if(array[b]<min){
                min = array[b];
            }
        }
        System.out.println("Значение минимального элемента массива: " + min);

        System.out.println("-".repeat(50));

        //Задача 3:
        //Найти индексы минимального и максимального элементов и вывести в консоль.

        int indexMin = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                indexMin = i;
                break;
            }
        }
        System.out.println("Индекс минимального элемента массива : " + indexMin);

        int indexMax = -1;
        for (int k = 0; k< array.length; k++){
            if (array[k] == max) {
                indexMax = k;
                break;
            }
        }
        System.out.println("Индекс максимального элемента массива : " + indexMax);


        System.out.println("-".repeat(50));


        //Задача 4:
        //Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
        //сообщение, что их нет.
        int zeroCount = 0;
        for (int zero = 0; zero < array.length; zero++) {
            if (array[zero] == 0) {
                zeroCount++;
            }

        }
        if(zeroCount>0){
            System.out.println("Количество нулевых элементов в массиве: " + zeroCount);
    } else {
        System.out.println("Нулевых элементов в массиве не найдено");
    }
        System.out.println("-".repeat(50));

        //Задача 5:
        //Пройти по массиву и поменять местами элементы первый и последний, второй и
        //предпоследний и т.д.

        for ( int i = array.length-1; i>=importNumbers/2; i--){
            int dividedElements = array[i];
            if (array[i] == dividedElements){
            }
            System.out.println(dividedElements);
        }

        for(int i = importNumbers-4; i >= 0; i--){
            int lastPartElements = array[i];
            if (array[i] == lastPartElements){

            }
            System.out.println(lastPartElements);
        }
        System.out.println();

        //Задача 6:
        //Проверить, является ли массив возрастающей последовательностью (каждое следующее
        //число больше предыдущего).
        System.out.println(Arrays.toString(array));

        boolean subsequence = true;
        for (int i = 1; i < array.length; i++) {
            if(array[i]<=array[i-1]){
                subsequence = false;
                break;
            }
        }
        if(subsequence){
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }

    }
}

