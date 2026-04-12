package oops;

class Parent {
    int x = 10;
    Parent() {
        System.out.println("Parent constructor");
    }
    void display() {
        System.out.println("displaying from parent");
    }
}

class Child extends Parent {
    int x = 20;

    Child() {
        // super must be the first statement in the constructor of child class 
        super();  // calls parent constructor
        System.out.println("Child constructor");
    }

    void show() {
        System.out.println(x);        // child
        System.out.println(super.x);  // parent
    }

    void display() {
        super.display();    // parent 
        System.out.println("displaying from child");
    }
}

public class superr {
    public static void main(String[] args) {
        
    }
}
