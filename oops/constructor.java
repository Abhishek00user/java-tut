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

public class constructor {
    public static void main(String[] args) {
        Test t1 = new Test();
        System.out.println(t1.x);

        Test t2 = new Test(20);
        System.out.println(t2.x); // 20
    }
}
