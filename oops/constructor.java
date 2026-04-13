package oops;

class Test {
    int x;

    Test() {
        this(10); // this keyword is used to call another constr of the same class and it should be the first statement in the constructor 
        System.out.println("Default");
    }

    // parameterized constructor and also constructor overloading as we have more than one constructor in the class
    Test(int y) {
        x = y;
        System.out.println(y);
    }

    // copy constructor, java doesn't have inbuilt copy const but we can create one
    Test(Test t) {
        x = t.x;
    }
}

// constructor in inheritance
class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        // super added by default if not explicitly written  by compiler
        super(); // it helps to call parent class constr
        System.out.println("Child constructor");
    }
}

// parameterized constr case in inheritance(super must be called explicitly if parent class doesn't have default constr and has parametrized constr)
// class Parent {
//     Parent(int x) {
//         System.out.println("Parent: " + x);
//     }
// }

// class Child extends Parent {
//     Child() {
//         super(10);  // must call explicitly
//         System.out.println("Child constructor");
//     }
// }

public class constructor {
    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println(t1.x);

        Test t2 = new Test(20);
        System.out.println(t2.x); // 20

        Child c = new Child(); // members of  parent class are also present in this child object so parent must be initialized first before child
    }
}
