package oops;

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Bark");
    }
}
// MULTIPLE INHERITANCE ACHIEVED USING INTERFACE
interface A {
    void show();
}

interface B {
    void display();
}

class Test implements A, B {
    // methods in interface needs to be implemented in the class which implements the interface o/w declare class as abstract
    public void show() { // public writing is must
        System.out.println("A");
    }

    public void display() {
        System.out.println("B");
    }
}


public class interfacee {
    public static void main(String[] args) {
        
    }
}
