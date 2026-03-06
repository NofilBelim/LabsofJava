package Lab6;
class Person {
    String name;

    Person(String name) {
        this.name = name;
        System.out.println("Person constructor called");
    }
}

class Student extends Person {
    int roll;

    Student(String name, int roll) {
        super(name);   // calling super class constructor
        this.roll = roll;
        System.out.println("Student constructor called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }
}

public class TestSuper {
    public static void main(String[] args) {
        Student s = new Student("Ali", 10);
        s.display();
    }
}