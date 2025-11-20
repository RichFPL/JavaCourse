package Practice;

public class Car implements Interface {

   public int count;
   public String name;

    public Car(int count, String name){
       this.count = count;
       this.name = name;
    }

    @Override
    public void print() {
        Interface.super.print();
    }
}
