package oops;

class Animal2 {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog2 extends Animal2 {
    void eat() {
        super.eat();  // used to call the parent method
        System.out.println("Dog eating...");
    }
}

// METHOD OVERRIDING
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

public class inheritance {
    public static void main(String[] args) {
        
        Dog d = new Dog();
        d.sound();
    }
}
