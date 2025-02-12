package LAB5;

abstract class Person {
    abstract void performDuty();
}

class Student extends Person {
    @Override
    void performDuty() {
        System.out.println("I am studying.");
    }
}

class Teacher extends Person {
    @Override
    void performDuty() {
        System.out.println("I am teaching.");
    }
}

public class SchoolManagement {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0] = new Student();
        people[1] = new Teacher();

        for (Person person : people) {
            person.performDuty();
        }
    }
}