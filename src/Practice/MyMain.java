package Practice;


import java.util.ArrayList;

public class MyMain {
    public static void main(String[] args){
        testFile();
    }

    public static void testFile(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        Integer [] array = numbers.toArray(new Integer[numbers.size()]);

    }
}
