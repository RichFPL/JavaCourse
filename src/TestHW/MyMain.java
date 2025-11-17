package TestHW;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class MyMain {
    public static void main(String[] args) {
        testReg();
    }

    public static void testReg(){
        int a = 10;
        int b = 0;
        File exceptions = new File("src/TestHW/exceptions.txt");

        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Произошла ошибка, идёт запись в файл");

            try {
                try (FileWriter fw = new FileWriter(exceptions)) {
                    fw.write(new Date() + " MISTAKE. EXCEPTION SAYS: " + e.getMessage() + "\n");
                }
                System.out.println("Ошибка успешно записана в файл.");
            } catch (IOException ioException) {
                System.err.println("Критическая ошибка: не удалось записать в лог-файл!");
                ioException.printStackTrace();
            }
        }
    }


}