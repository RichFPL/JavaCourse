package homework_java;

import java.util.Scanner;

public class HomeworkFiveLesson {
    public static void main(String[] args){
        getChess();
    }

    public static void getMassive(){
        //Задача 1:
        //1.1 Создать двумерный массив, заполнить его случайными числами.
        //1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
        //1.3 Найти сумму всех получившихся элементов и вывести в консоль
        int rows = 2;
        int cols = 2;
        int[][] sumMassive = new int[rows][cols];

        Scanner imput = new Scanner(System.in);
        for(int i = 0; i<sumMassive.length; i++){
            for(int j = 0; j<sumMassive[i].length; j++){
                System.out.println("Введите значения: ");
                sumMassive[i][j] = imput.nextInt();
            }
        }

        System.out.println("Введённые вами значение: ");

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.print(sumMassive[i][j] + "\t");
            }
            System.out.println();
        }
        imput.close();

        System.out.println("Сумма введённых вами значений: ");

        int sum = 0;
        for(int i = 0; i<sumMassive.length; i++){
            for(int j = 0; j<sumMassive[i].length; j++){
                sum += sumMassive[i][j];
            }
        }
        System.out.println(sum);
    }
    //Задача 2:
    //Создать программу для раскраски шахматной доски с помощью цикла. Создать
    //двумерный массив String 8х8. С помощью циклов задать элементам массива значения
    //B(Black) или W(White). При выводе результат работы программы должен быть
    //следующим:
    //W B W B W B W B
    //B W B W B W B W
    //W B W B W B W B
    //B W B W B W B W
    //W B W B W B W B
    //B W B W B W B W
    //W B W B W B W B
    //B W B W B W B W

    public static void getChess(){
        String[][] chess = new String[8][8];
        for(int i = 0; i< chess.length; i++){
            for(int j = 0; j<chess[i].length;j++){
                if((i+j)%2 == 0){
                    chess[i][j]="W";
                }else{
                    chess[i][j]="B";
                }
            }
        }
        for(int i = 0; i< chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                System.out.print(chess[i][j] +"\t");
            }
            System.out.println();
        }
    }

}
