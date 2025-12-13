package homework_java_20.task2;

//Задача 2
//Сортировка массива цифр в нескольких потоках различными алгоритмами:
// сортировка вставками;
// сортировка выбором;
// сортировка пузырьком.
//Каждый вид сортировки должен запускаться в отдельном потоке. После вывести
//результат отсортированных массивов в консоль.

import java.util.Arrays;
import java.util.Random;

public class MyMain {

    public static void main(String[] args) throws InterruptedException {
        int[] originalArray = generateRandomArray(10);
        System.out.println("Исходный массив: " + Arrays.toString(originalArray));
        System.out.println("--- Запуск потоков ---");

        int[] arrInsertion = Arrays.copyOf(originalArray, originalArray.length);
        int[] arrSelection = Arrays.copyOf(originalArray, originalArray.length);
        int[] arrBubble = Arrays.copyOf(originalArray, originalArray.length);

        Thread insertionThread = new Thread(new InsertionSortTask(arrInsertion), "InsertionSortThread");
        Thread selectionThread = new Thread(new SelectionSortTask(arrSelection), "SelectionSortThread");
        Thread bubbleThread = new Thread(new BubbleSortTask(arrBubble), "BubbleSortThread");

        insertionThread.start();
        selectionThread.start();
        bubbleThread.start();

        insertionThread.join();
        selectionThread.join();
        bubbleThread.join();

        System.out.println("\n--- Результаты сортировок (в Main) ---");
        System.out.println("Сортировка вставками: " + Arrays.toString(arrInsertion));
        System.out.println("Сортировка выбором:  " + Arrays.toString(arrSelection));
        System.out.println("Сортировка пузырьком: " + Arrays.toString(arrBubble));
    }

    private static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100); // Числа от 0 до 99
        }
        return arr;
    }
}


class InsertionSortTask implements Runnable {
    private final int[] array;

    public InsertionSortTask(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("[%s] Завершена за %d мс\n", Thread.currentThread().getName(), endTime - startTime);
    }
}

class SelectionSortTask implements Runnable {
    private final int[] array;

    public SelectionSortTask(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++)
                if (array[j] < array[minIdx])
                    minIdx = j;

            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("[%s] Завершена за %d мс\n", Thread.currentThread().getName(), endTime - startTime);
    }
}

class BubbleSortTask implements Runnable {
    private final int[] array;

    public BubbleSortTask(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("[%s] Завершена за %d мс\n", Thread.currentThread().getName(), endTime - startTime);
    }
}

