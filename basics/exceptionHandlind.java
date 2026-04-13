import java.io.IOException;

public class exceptionHandlind {
    // use of throws to declare that this method may throw an exception 
    static void readFile() throws IOException {
        throw new IOException("File error");
    }
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            System.out.println("Error "+e);
        } finally {
            System.out.println("Always runs");
        }

        // throw used to manually throw an exception
        int age = 15;
        if (age < 18) {
            throw new ArithmeticException("Not eligible");
        }
        System.out.println("Eligible");

    }
}
