package homework_java_16;


import static homework_java_16.StringPairs.pairs;
import static homework_java_16.WordCounterOptimized.wordMultiple;

public class MyMain {
    public static void main(String[] args){
       outputArrayStrings();
       outputStringPairs();
    }
//Задача 1:
//На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
//строка является ключом, и ее значение равно true, если эта строка встречается в массиве
//2 или более раз. Пример:
//wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
//wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
//wordMultiple(["c", "c", "c", "c"]) → {"c": true}
    public static void outputArrayStrings(){
        String[] arr1 = {"a", "b", "a", "c", "b"};
        System.out.println("Решение 1 задачи: " + wordMultiple(arr1));;

    }
    //Задача 2
    //На вход поступает массив непустых строк, создайте и верните Map<String,
    //String> следующим образом: для каждой строки добавьте ее первый символ в
    //качестве ключа с последним символом в качестве значения. Пример:
    //pairs(["code", "bug"]) → {"b": "g", "c": "e"}
    //pairs(["man", "moon", "main"]) → {"m": "n"}
    //pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}

    public static void outputStringPairs(){
        System.out.println("-".repeat(50));
        String[] arr2 = {"man", "moon", "good", "night"};
        System.out.println("Решение 2 задачи: " + pairs(arr2));
    }

}

