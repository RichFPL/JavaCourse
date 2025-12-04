package homework_java_18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

//Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
//Stream'ов:
//- Удалить дубликаты
//- Оставить только четные элементы
//- Вывести сумму оставшихся элементов в стриме
public class MyMain {
    public static void main(String[] args){

    }

    public static void addStream(){
        ArrayList<Integer> counts = new ArrayList<>(Arrays.asList(1,7,3,10,20,40,15));
        Stream<Integer> readArray = counts.stream();
        for(int x : counts){
            System.out.println(counts);
        }
    }
}
