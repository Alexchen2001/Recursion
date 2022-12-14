package exercises;

public class RecursionProgram {

    public static int fac(int n) {
        //TODO: COMPLETE BODY
        if (n ==0 || n ==1){
            return 1;
        } else{
            return n * fac(n -1);
        }
    }

    public static int fib(int n) {
        //TODO : COMPLETE BODY
        if (n == 0){
            return 0;
        } else if(n ==1){
            return 1;
        }else{
            return fib(n -1) + fib(n-2);
        }
    }

    public static boolean isPalindrome(String s) {
        //TODO : COMPLETE BODY
        int len = s.length();

        if (len < 2){
            return true;
        }else{
            char first = s.charAt(0);
            char last = s.charAt(len-1);
            String middle = s.substring(1, len -1);
            return (first == last) && isPalindrome(middle);
        }
    }

    public static double pow(double x, int n) {
        //TODO: COMPLETE BODY
        if (n == 0){
            return 1;
        }else{
            return  x * pow(x, n - 1);
        }
    }

    public static int sum(int n) {
        //TODO : COMPLETE BODY
        if (n == 1) {
            return 1;
        } else {
            return n + sum(n -1);
        }
    }


    public static void testPalindrome(){
        System.out.println();

        String[] strings = new String[11];
        strings[0]  = "madam";
        strings[1]  = "racecar";
        strings[2]  = "tacocat";
        strings[3]  = "step on no pets";
        strings[4] = "able was I ere I saw elba";
        strings[5]  = "Java";
        strings[6]  = "rotater";
        strings[7]  = "byebye";
        strings[8]  = "notion";
        strings[9]  = "";
        strings[10] = "a";

        for (String str : strings) {
            System.out.printf("Is \"%s\" a palindrome? %6s\n", str, isPalindrome(str));
        }

    }

    public static void testRecursiveMath(){
        int n = 5;

        //count of nth factorial
        System.out.println("------------- nth factorial --------------");
        for (int i = 0; i <= n; i++ ) {
            System.out.print(i + "\t");
        }
        System.out.println();

        //value for nth factorial
        for (int i = 0; i <= n; i++ ) {
            System.out.print(fac(i) + "\t");
        }
        System.out.println();

        n = 4;
        System.out.println();
        System.out.println("-------------- sum(n) -------------");

        //summation of n integers
        int sum = n * (n + 1) / 2;
        System.out.println("sum of " + n + " integers: " + sum);
        System.out.println("sum of " + n + " integers: " + sum(n));

        //two to the power of  n
        n = 16;
        double twoToN = Math.pow(2, n);
        System.out.println();
        System.out.println("-------------- pow(2, n) -------------");
        System.out.println("pow(2, n): " + n + " gives " + twoToN);
        System.out.println("pow(2, n): " + n + " gives " + pow(2, n));
        System.out.println();

        //e to the power of  n
        n = 8;
        double xToN = Math.pow(Math.E, n);
        System.out.println("-------------- pow(x,n) -------------");
        System.out.println("x(n):      " + n + " gives " + xToN);
        System.out.println("pow(e, n): " + n + " gives " + pow(Math.E, n));

    }

    public static void main(String[] args) {
        testRecursiveMath();
        testPalindrome();



    }
}