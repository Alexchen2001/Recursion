package exercises;

public class FibonacciTest {

    public static long fib(int n) {
        //TODO : COMPLETE BODY OF RECURSIVE METHOD
        return 0;
    }

    public static long mfib(int n) {
        //TODO : COMPLETE BODY OF RECURSION WITH MEMOIZATION
        return 0;
    }

    private static long memo(int n, int[] x) {
        //TODO : COMPLETE BODY OF HELPER METHOD
        return 0;
    }

    public static long ifib() {
        //TODO : COMPLETE BODY OF ITERATIVE METHOD
        return 0;
    }

    public static void testRecursive(){
        int n = 9;

        // QUICK CHECK : count of nth factorial
        System.out.print("--------------------------------- nth Fibonnacci ");
        System.out.println("-------------------------------");
        for (int i = 0; i <= n; i++ ) {
            System.out.print(i + "\t");
        }
        System.out.println();

        //value for nth factorial
        for (int i = 0; i <= n; i++ ) {
            System.out.print(fib(i) + "\t");
        }
        System.out.println();
    }

    public static void testMemoization(){}
    public static void testIterative(){}

    public static void main(String[] args) {

    }

}
