package oops;

// static int x = 5; error because they can't be declared outside the class as they need class for accessing them

class outer {
    int d; // instance member variable (those vars which are created everytime when an object is created)

    static int c = 5; // static member var(those vars which are created only once and shared among all the objects of the class)
    static class inner{
        public static String name = "Inner Class";
        //it can access only static members of the outer class
        void show() {
            System.out.println(c);  // allowed
        }
    }

    static void display() { // static method
        System.out.println(c);  // allowed to access static member var
    }

    // normal function
    public int add(int a, int b) {   // no need to use public here as it is by default public in the same package
        return a + b;               // a and b are local vars
    }
}
class car {
    String color;  //vars or properties of the class car
    int speed;
     
    void drive(){ // methods or behavior of the class car
        System.out.println("Driving at " + speed);
    }
}
public class basic {
    static int y = 6;
    public static void main(String[] args) {
        // objects are always created dynamically in java whereas in cpp we can create both statically(car c1; or dynamically car* c1 = new car();)
        car c1 = new car(); //c1 is not exactly an object instead it's a reference variable that stores the reference of the object created in the heap memory
        c1.color = "Blue";
        c1.speed = 45;
        c1.drive();

        outer.inner i = new outer.inner(); // object of inner class created without object of outer class because inner class is static
        System.out.println(outer.inner.name); // name can be accessed in this way without any obj as it is static member of inner class
        i.show();
        System.out.println(outer.c); // static member vars directly accessed by class name in main function because main itself is static
        outer.display(); // static method called by class name
        System.out.println(y); // static member var directly accessed by class name in main function because main itself is static
    }
}
