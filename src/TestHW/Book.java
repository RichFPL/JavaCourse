package TestHW;

class Book implements Swimmable {
    String name;
    String username;

    Book(String name, String username){
        this.name = name;
        this.username = username;
    }

    public void swim(){
        System.out.println("Hello");
    }
}
