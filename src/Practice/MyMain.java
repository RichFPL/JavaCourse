package Practice;

import java.util.Scanner;


public class MyMain {
    public static void main(String[] args) {
        int area = calculateArea(5,5);
        System.out.println(area);
    }


    public static int calculateArea(int width, int height) {
            int square = width * height;
            return square;
    }
}
