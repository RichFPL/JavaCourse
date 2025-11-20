package homework_java_14;

import java.io.*;
import java.util.Scanner;

//Задача 1:
//В задании приложен файл Ромео и Джульетта на английском, вычитать его в приложении.
//Проанализировать и записать в другой файл самое длинное слово.

public class MyMain {
    public static void main(String[] args) {
        readBook();
    }

    public static void readBook() {

        try (FileWriter fileWriter = new FileWriter("src/homework_java_14/Book.txt")) {
            fileWriter.write("Старый маяк гордо возвышался над бушующим морем. " +
                    "Его мощный луч света, словно ОКЛИК, пронзал темноту ночи. " +
                    "Смотритель, невысокий старик в шерстяном свитере, пил горячий чай. " +
                    "Он знал, что его работа ВАЖНА. " +
                    "Вдали виднелся силуэт корабля под флагом БРИТ. Море никогда не спит, и он тоже не мог позволить себе отдыхать. " +
                    "Это был его долг, его судьба, его крест. ОДИНОЧЕСТВО стало для него привычным.");
            fileWriter.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try (FileReader fileReader = new FileReader("src/homework_java_14/Book.txt")) {
            System.out.println("Вот так выглядит текст, записанный нами в файл, рандомный: ");
            System.out.println(fileReader.readAllLines());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String longestWord = "";
        try (BufferedReader reader = new BufferedReader(new FileReader("src/homework_java_14/Book.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    String cleanedWord = word.replaceAll("[^a-zA-Zа-яА-Я0-9]", "");
                    if (cleanedWord.length() > longestWord.length()) {
                        longestWord = cleanedWord;
                    }
                }
            }
            if (!longestWord.isEmpty()) {
                System.out.println("Самое длинное слово в файле: \"" + longestWord + "\"");
            } else {
                System.out.println("Файл пуст или не содержит слов.");
            }

        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }

}


