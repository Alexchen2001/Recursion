package exercises;

public class FibonacciTest {

    public static long fib(int n) {
        //TODO : COMPLETE BODY OF RECURSIVE METHOD
        if (n == 0){
            return 0;
        } else if(n ==1){
            return 1;
        }else{
            return fib(n -1) + fib(n-2);
        }
    }

    public static long mfib(int n) {
        //TODO : COMPLETE BODY OF RECURSION WITH MEMOIZATION
        if (n == 0){
            return 0;
        } else if(n ==1){
            return 1;
        }else{
            long[] x = new long[n];
            x[0] = 0;
            x[1] = 1;

            if (n != 2){
                x[n-1] = memo(n-1, x);
            }
            return x[n-1] + x[n-2];
        }
    }

    private static long memo(int n, long[] x) {
        //TODO : COMPLETE BODY OF HELPER METHOD
        if(x[n] == 0){
            x[n] = memo(n-1,x) + x[n-2];
        }
        return x[n];
    }

    public static long ifib(int n) {
        //TODO : COMPLETE BODY OF ITERATIVE METHOD

        if ( n ==0){
            return 0;
        } else if(n ==1){
            return 1;
        }else {
            long fib_n = 0;
            long fib_n_2 = 0;
            long fib_n_1 = 1;

            for (int i = 2; i <=n; i++) {
                fib_n = fib_n_1 + fib_n_2;
                fib_n_2 = fib_n_1;
                fib_n_1 = fib_n;
            }
            return fib_n;
        }
    }

    public static void testRecursive(int n){

        // QUICK CHECK : count of nth factorial
        System.out.print("--------------------------------- nth Fibonnacci  (fib) ");
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

    public static void testMemoization(int n){
        System.out.println();
        // QUICK CHECK : count of nth factorial
        System.out.print("--------------------------------- nth Fibonnacci (mfib)");
        System.out.println("-------------------------------");
        for (int i = 0; i <= n; i++ ) {
            System.out.print(i + "\t");
        }
        System.out.println();

        //value for nth factorial
        for (int i = 0; i <= n; i++ ) {
            System.out.print(mfib(i) + "\t");
        }
        System.out.println();
    }

    public static void testIterative(int n){
        System.out.println();
        // QUICK CHECK : count of nth factorial
        System.out.print("--------------------------------- nth Fibonnacci (ifib) ");
        System.out.println("-------------------------------");
        for (int i = 0; i <= n; i++ ) {
            System.out.print(i + "\t");
        }
        System.out.println();

        //value for nth factorial
        for (int i = 0; i <= n; i++ ) {
            System.out.print(ifib(i) + "\t");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        testRecursive(8);
        testMemoization(8);
        testIterative(8);
        System.out.println();

        testRecursive(21);
        testMemoization(21);
        testIterative(21);
        System.out.println();

        testRecursive(42);
        testMemoization(42);
        testIterative(42);

    }

}
