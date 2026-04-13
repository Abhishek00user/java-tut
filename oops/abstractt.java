package oops;
// class declared with abstract and it cannot be instantiated and it can have abstract and concrete methods
// 👉 If a class has even one abstract method:
// ➡️ The class MUST be declared abstract

abstract class Animal {
    abstract void sound();  // abstract method (method without implementation) and it must be implemented by the child class otherwise child class also becomes abstract and can't be instantiated

    void eat() {           // normal method
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    // abstract method overridden and implemented
    void sound() {
        System.out.println("Bark");
    }
}
public class abstractt {
    public static void main(String[] args) {
        
    }
}
