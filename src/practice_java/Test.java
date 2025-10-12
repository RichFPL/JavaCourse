package practice_java;

import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
       extendArray();
    }

    public static void extendArray(){
        int[] best = new int[]{-1, 5, 10, 15, -5, 8};
        int[] theBest = new int[best.length + 10];
        for(int index = 9, bestIndex = 0; bestIndex<best.length; index++, bestIndex++){
            theBest[index] = best[bestIndex];
        }

        for(int index = 0; index < theBest.length; index++){
            System.out.println("New names[" + index + "]: " + theBest[index] );
        }
    }

    public static void useMathLibrary(){

        String[] names = new String[]{"Vladik", "Lizka","Dimka","Tomka","Vovka"};
        for (int index = 0; index < names.length; index++){
            System.out.println("Your name is " + names[index]);
        }
    }



}
