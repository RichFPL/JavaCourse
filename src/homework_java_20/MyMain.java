package homework_java_20;

import java.util.Scanner;
import java.util.Arrays;
//Пользователь вводит с клавиатуры значение в массив. После чего запускаются два
//потока. Первый поток находит максимум в массиве, второй — минимум. Результаты
//вычислений возвращаются в метод main().
public class MyMain {

    static class MaxFinder extends Thread {
        private final int[] array;
        private int max = Integer.MIN_VALUE;

        public MaxFinder(int[] array) {
            this.array = array;
        }

        @Override
        public void run() {
            for (int value : array) {
                if (value > max) {
                    max = value;
                }
            }
            System.out.println("Поток MaxFinder завершен. Максимум найден.");
        }

        public int getMax() {
            return max;
        }
    }

    static class MinFinder extends Thread {
        private final int[] array;
        private int min = Integer.MAX_VALUE;

        public MinFinder(int[] array) {
            this.array = array;
        }

        @Override
        public void run() {
            for (int value : array) {
                if (value < min) {
                    min = value;
                }
            }
            System.out.println("Поток MinFinder завершен. Минимум найден.");
        }

        public int getMin() {
            return min;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");

        int size = 0;
        try {
            size = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Ошибка ввода размера. Используется размер по умолчанию: 5");
            size = 5;
        }

        int[] dataArray = new int[size];
        System.out.println("Введите " + size + " целых чисел (через пробел или Enter):");

        for (int i = 0; i < size; i++) {
            if (scanner.hasNextInt()) {
                dataArray[i] = scanner.nextInt();
            } else {
                System.out.println("Неверный ввод, установка 0 для элемента " + i);
                dataArray[i] = 0;
                scanner.next(); // Пропустить некорректный ввод
            }
        }
        scanner.close();

        System.out.println("Введенный массив: " + Arrays.toString(dataArray));

        MaxFinder maxFinderThread = new MaxFinder(dataArray);
        MinFinder minFinderThread = new MinFinder(dataArray);

        maxFinderThread.start();
        minFinderThread.start();

        try {
            maxFinderThread.join();
            minFinderThread.join();

            int maxResult = maxFinderThread.getMax();
            int minResult = minFinderThread.getMin();

            System.out.println("\n--- Результаты в методе main() ---");
            System.out.println("Максимальное значение в массиве: " + maxResult);
            System.out.println("Минимальное значение в массиве: " + minResult);

        } catch (InterruptedException e) {
            System.err.println("Главный поток был прерван во время ожидания.");
        }
    }
}

