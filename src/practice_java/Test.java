package practice_java;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
       extendArray();
    }

    public static void extendArray() {
        int[][] matrixa;
        matrixa = new int[2][3];
        matrixa[0][0] = 1;
        matrixa[0][1] = 2;
        matrixa[0][2] = 3;
        matrixa[1][0] = 4;
        matrixa[1][1] = 5;
        matrixa[1][2] = 6;

        for (int[] row : matrixa){
            for (int col : row){
                System.out.print(col + "\t"); // col = table4xN[0][0], col = table4xN[0][1], col = table4xN[0][2]
            }
            System.out.println();
        }
    }

}
