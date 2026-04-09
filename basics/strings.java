public class strings {
    public static void main(String[] args) {
        String name = "Navin";
        String name2 = "Navin"; // both name and name2 refer to same memory location in the memory(string pool)
        System.out.println(name == name2); // true as they have same reference in the memory

        String name3 = new String("Navin");
        String name4 = new String("Navin"); // name3 and name4 refer to different memory location in the memory(heap) as different objects are created
        System.out.println(name3.equals(name4)); // true as they have same value
        System.out.println(name3 == name4); // false as they have different reference in the memory
        

        // String is immutable in java. It means once a string is created, it cannot be changed.
        // If we try to change the string, a new string will be created in the memory and the reference will point to the new string.

        name = "Harsh"; // This will create a new string "Harsh" in the memory and the reference name will point to it and old value of name will be garbage
        System.out.println(name);
    }
}
