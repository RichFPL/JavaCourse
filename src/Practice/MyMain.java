package Practice;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyMain {
    public static void main(String[] args){
        testFile();
    }

    public static void testFile(){
        try(FileReader fileReader = new FileReader("src/Practice/message.txt")){
            int character;
            while((character = fileReader.read()) != -1){
                System.out.print((char) character);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(FileWriter fileWriter = new FileWriter("src/Practice/message.txt")){
            fileWriter.write("Hello world");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(FileReader fileReader = new FileReader("src/Practice/message.txt")){
            int character;
            while((character = fileReader.read()) != -1){
                System.out.print((char) character);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
