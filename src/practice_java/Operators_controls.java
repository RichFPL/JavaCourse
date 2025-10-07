package practice_java;

import java.util.Scanner;

public class Operators_controls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число : ");

        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("Спасибо, вы ввели число " + number);
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова");
        }
        getOther();
        newScan();
    }
    public  static void getOther() {
        Scanner ad = new Scanner(System.in);
        String x;
        System.out.println("Загадайте желание");
        if (ad.hasNext()) {
            x = ad.nextLine();
            System.out.println("Ваше желание будет выполнено");
        } else {
            System.out.println("Не выполним");
        }
    }
    public static void newScan(){
        Scanner af = new Scanner(System.in);
        String family;
        System.out.println("Введите вашю фамилию");
        if(af.hasNext()){
           family = af.nextLine();
           System.out.println("Ваша фамилия : " + family);
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}



