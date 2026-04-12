package oops;

class Test {
    int x;

    void setX(int x) {
        this.x = x;  // refers to instance variable or current object of the class
    }
    void display() {
        System.out.println("Display");
    }

    void show() {
        this.display();  // calling method
    }
}
public class thisKeyword {
    public static void main(String[] args) {
        Test t = new Test();
        t.setX(10);
    }
}
