package oops;
// 🔷 What is Constructor Chaining?
// 👉 Constructor chaining = calling one constructor from another

// ➡️ It can happen:
// Within the same class → using this()
// Between parent & child → using super()
class Test {
    Test() {
        this(10);   // calls parameterized constructor and it must be the first statement in constr
        System.out.println("Default constructor");
    }

    Test(int x) {
        System.out.println("Parameterized: " + x);
    }
}

// using super
class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        super();  // calls parent constructor
        System.out.println("Child constructor");
    }
}

public class constrChaining {
    public static void main(String[] args) {
        
    }
}
