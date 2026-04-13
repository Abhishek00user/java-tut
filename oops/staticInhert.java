package oops;

class Parent {
    static int x = 10;
    static void show() {
        System.out.println("Parent method");
    }
}

class Child extends Parent {
    // Method hiding: static method in child class with same signature as parent class. this is not overriding as static method can't be
    //  overridden because static methods are resolved at compile time but overriding resolved at runtime.
    static void show() {
        System.out.println("Child method");
    }
}
public class staticInhert {
    public static void main(String[] args) {
        System.out.println(Child.x); //static var can be inherited but accessed by class name
        Parent.show();
        Child.show();
    }
}
