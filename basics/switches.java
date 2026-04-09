public class switches {
    public static void main(String[] args) {
        //  TRADITIONALSWITCHES
        int w = 8;
		switch(w) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
            System.out.println("Wednesday");
                break;
            default:
                System.out.println("Enter a valid number");
        }
        // MODERN SWITCHES(NO NEED OF BREAK STATEMENT)
        int day = 2;

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Invalid");
        }

        // MULTIPLE CASES IN A SINGLE CASE
        int m = 5;
        switch (m) {
            case 1,2 -> System.out.println("working day");
            case 7 -> System.out.println("weekend");
        }

        // SWITCH AS AN EXPRESSION
        int day3 = 3;

        String result = switch (day3) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Invalid";
        };

        System.out.println(result);

        // USING YIELD WHEN BLOCK SCOPE USED AFTER ->
        int day5 = 2;

        String result2 = switch (day5) {
            case 1 -> {
                System.out.println("Extra logic");
                yield "Monday";
            }
            case 2 -> {
                yield "Tuesday";
            }
            default -> {
                yield "Invalid";
            }
        };
        System.out.println(result2);
    }
}
