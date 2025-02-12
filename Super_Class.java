package LAB5;

class Superclass {
    private int a = 7;

    public int getA() {
        return a;
    }
}

class Derivedclass extends Superclass {
    void display() {
        System.out.println("Accessing private number through method: " + getA());
    }
}

public class Super_Class {
    public static void main(String[] args) {
        Derivedclass obj = new Derivedclass();
        obj.display();
    }
}
