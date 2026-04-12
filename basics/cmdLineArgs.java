// HOW TO RUN THIS PROGRAM AS ITS INSIDE A FOLDER:
// 1-> javac -d . cmdLineArgs.java
// 2 -> java cmdLineArgs hello world 10 20
// IF THERE IS NO PACKAGE DECLARATION(LIKE IN THIS CASE) THEN WE CAN DIRECTLY RUN THE PROGRAM WITHOUT USING THE FOLDER NAME IN THE COMMAND 
// O/W USE java basics.cmdLineArgs hello world
// if more args added or any change made then it needs to be recompiled 
public class cmdLineArgs {
    public static void main(String[] args) {
        // 🔷 What are Command Line Arguments?

        // 👉 Command line arguments are values passed to a Java program when you run it from the terminal/command prompt
        // 👉 They are stored in:String[] argsinside the main() method . All inputs always passed as string
        System.out.println(args[0]);
        System.out.println(args[1]);

        // convert if needed 
        int a = Integer.parseInt(args[2]);
        int b = Integer.parseInt(args[3]);

        System.out.println("Sum = " + (a + b));

        // comment everything above and run the program with different number of arguments to see what happens
        // for (int i = 0; i < args.length; i++) {
        //     System.out.println(args[i]);
        // }
    }
}
