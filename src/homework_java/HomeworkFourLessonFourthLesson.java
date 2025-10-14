package homework_java;

public class HomeworkFourLessonFourthLesson {
    public static void main(String[] args) {
        getRemoval();

    }
//Задача 1:
//Пройти по массиву, вывести все элементы в прямом и в обратном порядке
    public static void getRemoval(){
        int[] numbers = new int[]{1, 5, 10, 15, 20};
        System.out.println("Массив в правильном порядке:");

        for(int index = 0; index<numbers.length; index++){
            System.out.println(numbers[index]);
        }
        System.out.println("-".repeat(50));
        System.out.println("Массив в обратном порядке:");

        for(int reverse = numbers.length-1; reverse>=0; reverse--){
            System.out.println(numbers[reverse]);
        }
    }
}