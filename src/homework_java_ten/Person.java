package homework_java_ten;

import java.util.Objects;

public class Person {
    public String name;
    public String username;
    public String profession;
    public int age;

    public Person(String name, String username, String profession, int age){
        this.name = name;
        this.username = username;
        this.profession = profession;
        this.age = age;
    }

    @Override
    public String toString() {
        return "\tPerson: " + "\n" +
                "\tName: " + name + "\n" +
                "\tUsername: " + username + "\n" +
                "\tProfession: " + profession + "\n" +
                "\tAge: " + age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, username, profession, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return  age == person.age &&
                Objects.equals(name, person.name);
    }
}
