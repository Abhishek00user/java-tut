public class mutable_str {
    public static void main(String[] args) {

        // 👉 Problem with String:
        // Strings are immutable
        // Every modification creates a new object ❌ (memory + performance issue)

        // 👉 Solution:
        // ➡️ Mutable strings → StringBuffer & StringBuilder

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println(sb); //Same object modified (no new object creation)

        StringBuffer sb2 = new StringBuffer("Hello"); // Thread-safe (synchronized) but slower
        sb2.append(" World");
        System.out.println(sb2);

        // 👉 A piece of code is thread-safe if:
        // ➡️ Multiple threads can access it at the same time WITHOUT causing incorrect results or data corruption
    }
}
