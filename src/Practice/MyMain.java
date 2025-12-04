package Practice;

//Создать систему для вычисления площади
// геометрических фигур (круга и прямоугольника) и
// использовать полиморфизм через интерфейс для обработки их в общем списке.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class MyMain {
    public static void main(String[] args) {
        createString();
    }

    public static void createString() {
        TreeSet<Integer> counts = new TreeSet<>();
        counts.add(5);
        counts.add(2);
        counts.add(10);
        counts.add(1);
        System.out.println(counts);
    }
}
