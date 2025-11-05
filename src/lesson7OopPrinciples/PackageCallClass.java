package lesson7OopPrinciples;

public class PackageCallClass {
    public static void main(String[] args) {
        // Call one object from another Object in the PACKAGE
        Person jennifer = new Person("Jennifer", "Johnson");
        jennifer.protectedValue = -1;
    }
}
