package Practice;


import java.util.ArrayList;

public class MyMain {
    public static void main(String[] args){
        testFile();
    }

    public static void testFile(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(10);
        numbers.add(5);
        numbers.add(1);
        System.out.println(numbers.size());
        System.out.println(numbers.get(0));
        System.out.println(numbers);
    }
}
