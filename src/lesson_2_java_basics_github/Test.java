package lesson_2_java_basics_github;

public class Test {
    public static void main(String[] args){
        System.out.println("Welcome to the Java");
        System.out.println();

        getSumms();
    }
    public static void getSumms(){
        byte byteValue = 125;
        short shortValue = 28_570;
        int intValue = -1_345_456_456;
        long longValue = 3_345_345_445_3434L;

        char letter = '*';

        float floatValue = 34.56F; // .+7 numbers
        double doubleValue = 56.2049458695812; // .+15numbers, JAVA double by default

        boolean isAMarried = true; // TRUE или FALSE, нельзя представить значение типа 0, 1

        // СТРОЧКА ЯВЛЯЕТСЯ ССЫЛОЧНЫМ ТИПОМ ДАННЫХ
        String name = "Archil";
        String surname = "Sikharulidze";

        System.out.println("byte byteValue =" + byteValue);
        System.out.println("short shortValue " + shortValue);
        System.out.println("int intValue " + intValue);
        System.out.println("long longValue " + longValue);

        System.out.println("char letter = " + letter);

        System.out.println("float floatValue = " + floatValue);
        System.out.println("double doubleValue " + doubleValue);

        System.out.println("boolean isAMarried " + isAMarried);

        getCharType();
    }
    public static void getCharType() {
        // char -> это целочисленное представление ЛЮБОГО ЗНАКА
        char symbol = '5';

        System.out.println("char symbol = '5' -> " + symbol);
        symbol = '0';
        System.out.println("char symbol = '0' -> " + symbol);
        symbol = 5;
        System.out.println("char symbol = 5 -> " + symbol);
        symbol = 66;
        System.out.println("char symbol = 66 -> " + symbol);
        symbol = 90;
        System.out.println("char symbol = 90 -> " + symbol);

        int intMyValue = 35_000;
        short myShortValue = (short)intMyValue;
        System.out.println("int intMyValue = " + intMyValue);

        byte myByteValue = 110;
        int smInt = myByteValue;
        System.out.println("int smInt = " + smInt);

        float myFloatValue = 121.45F;
        int mixInt = (int)myFloatValue;
        System.out.println("int mixInt = " + mixInt);
        long myLongValue = 1231242513;
        int newInt = (int)myLongValue;
        System.out.println("int newInt = " + newInt);
    }
}
