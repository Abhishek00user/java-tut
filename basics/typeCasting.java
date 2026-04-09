public class typeCasting {
    public static void main(String[] args) {
        //👉 Typecasting = converting one data type into another
        //👉 Implicit typecasting = automatic type conversion(smaller -> larger data type),DONE AUTOMATICALLY BY JAVA
        int a = 10;
        double b = a;   // int → double
        System.out.println(b);

        //👉 Explicit typecasting = manual type conversion(larger -> smaller data type),DONE MANUALLY BY PROGRAMMER
        double c = 10.5;
        int d = (int) c;   // double → int
        System.out.println(d);

        // overflow case
        int e = 130;
        // byte w = (byte) a; // overflow occurs, byte can only hold values from -128 to 127
    }
}
