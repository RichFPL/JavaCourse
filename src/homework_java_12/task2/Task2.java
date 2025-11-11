package homework_java_12.task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Задача *:
//Программа на вход получает произвольный текст. В этом тексте может быть номер
//документа(один или несколько), емейл и номер телефона. Номер документа в формате:
//xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
//может содержать не всю информацию, т.е. например, может не содержать номер
//телефона, или другое. Необходимо найти эту информацию и вывести в консоль в
//формате:
//email: teachmeskills@gmail.com
//document number: 1423-1512-51e
//и т.д
public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите произвольный текст:");
        String inputText = scanner.nextLine();
        scanner.close();

        // Поиск и вывод информации
        findAndPrintDocumentNumbers(inputText);
        findAndPrintEmails(inputText);
        findAndPrintPhoneNumbers(inputText);
    }

    public static void findAndPrintDocumentNumbers(String text) {
        String formPattern = "\\b\\d{4}-\\d{4}-\\d{2}\\b";
        Pattern pattern = Pattern.compile(formPattern);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("document number: " + matcher.group());
        }
    }

    public static void findAndPrintEmails(String text) {
        // Паттерн: набор символов, @, набор символов, точка, домен
        // Этот паттерн достаточно общий для большинства email
        String regex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("email: " + matcher.group());
        }
    }

    public static void findAndPrintPhoneNumbers(String text) {
        // Паттерн: +, (, 2 цифры, ), 7 цифр
        String regex = "\\+\\(\\d{2}\\)\\d{7}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println("phone number: " + matcher.group());
        }
    }

}
