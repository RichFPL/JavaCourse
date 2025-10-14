package practice_java;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
       extendArray();
    }

    public static void extendArray() {
/*
        int n = 42;
        double[] randoms = new double[n];
        for(int i = 0; i<n; i++){
            randoms[i] = Math.random();
            System.out.println(randoms[i]*100);
        }

        int[] nums = new int[]{5,10,15,20,25};
        for (int index = 0; index< nums.length;index++){
            nums[index] = index + 1;
        }

        String[] names = new String[]{"Vova", "Vlad", "Ksuha"};
        for(String name : names){
            System.out.println(name);
        }

        int[] newNum = new int[]{1,5,8,10,12};
            System.out.println(Arrays.toString(newNum));
            Arrays.sort(newNum);
        System.out.println(Arrays.toString(newNum));


        int[] changer = new int[]{12,3,8,16,20};
        Arrays.sort(changer);
        for(int newChanger : changer){
            System.out.println(newChanger);
        }

 */
        int[] array = new int[]{5, 7, 10, 12, 15};
        int[] newArray = new int[]{0,0,0,0,0,0,0,0,0,0};

        System.out.println("Default string array: " + Arrays.toString(array));
        System.out.println("Default string newArray: " + Arrays.toString(newArray));

        System.arraycopy(array,0, newArray,2,3);
        System.out.println("newArray after copy: " + Arrays.toString(newArray));
    }

}
