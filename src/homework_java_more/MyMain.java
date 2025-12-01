package homework_java_more;

//1. Создать программу, которая принимает через переменную args n-ое количество параметров.
//2. Эти параметры сохранить в Объекте "Терминал"
//3. Сериализовать объект и сохранить его в текстовом документе.

import java.io.*;

public class MyMain {
    private static final String FILE_NAME = "terminal_data.ser";
    public static void main(String[]args){
        if (args.length == 0) {
            System.out.println("Пожалуйста, передайте n-ое количество параметров через аргументы командной строки.");
            System.out.println("Пример запуска: java TerminalSerializer param1 param2 param3");
            return;
        }

        Terminal terminalObject = new Terminal(args);
        System.out.println("Создан объект терминала: " + terminalObject);

        // 3. Сериализация объекта и сохранение его в текстовом документе (бинарном файле)
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(terminalObject);
            System.out.println("Объект успешно сериализован и сохранен в файл: " + FILE_NAME);
        } catch (IOException e) {
            System.err.println("Ошибка при сериализации: " + e.getMessage());
            e.printStackTrace();
        }
        readObjectFromFile();
    }

    private static void readObjectFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            Terminal loadedTerminal = (Terminal) ois.readObject();
            System.out.println("\n--- Проверка десериализации ---");
            System.out.println("Прочитанный из файла объект: " + loadedTerminal);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Ошибка при десериализации: " + e.getMessage());
        }
    }
}
