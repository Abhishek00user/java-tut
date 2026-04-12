package oops;

// 🔷 What is an Initialization Block?
// 👉 A block of code inside a class that runs automatically during object creation or class loading.

// 🔶 Types of Initialization Blocks
// There are 2 types:

// 1️⃣ Instance Initialization Block (IIB)
// 👉 Runs every time an object is created
// 👉 Runs before constructor

// 🔷 2️⃣ Static Initialization Block (SIB)
// 👉 Runs only once when class is loaded

// 👉 Order:1️⃣ Static block (once)           2️⃣ Instance block(as many obj created)                3️⃣ Constructor
class Test {
    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Instance Block");
    }

    Test() {
        System.out.println("Constructor");
    }
}

public class intializBlock {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test(); 
        // output
        // Static Block
        // Instance Block
        // Constructor
        // Instance Block
        // Constructor
    }
}
