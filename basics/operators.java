public class operators {
    public static void main(String[] args) {
        // pre increment and post increment behave differently when we try to print the value of the variable in the same line as the increment operator
        int num = 7;
        int res = ++num; // output -> 8
        System.out.println(res);
        System.out.println(num);

        int num2 = 5;
        int res2 = num2++; // output -> 5
        System.out.println(res2);
        System.out.println(num2); // output -> 6 it has incremented but it is not reflected in the res2 variable because it is post increment

        // TERNARY OPERATOR
        int n=5;
		int result=0;
		result = n%2==0 ? 10 : 20;
		System.out.println(result);	
    }
}
