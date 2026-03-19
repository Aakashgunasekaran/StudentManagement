import java.util.*;

public class New {

        static int fibonacci(int n, int[] dp) {

            // Base cases
            if (n == 0 || n == 1) {
                System.out.println("Base case reached: fib(" + n + ") = " + n);
                return n;
            }

            // If already computed
            if (dp[n] != -1) {
                System.out.println("Using memoized value: fib(" + n + ") = " + dp[n]);
                return dp[n];
            }

            // Computing for the first time
            System.out.println("Computing fib(" + n + ")");

            dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);

            System.out.println("Computed fib(" + n + ") = " + dp[n]);
            return dp[n];
        }

        public static void main(String[] args) {

            int n = 6;
            int[] dp = new int[n + 1];

            Arrays.fill(dp, -1);

            System.out.println("Final Answer: Fibonacci of " + n + " is " + fibonacci(n, dp));
        }
    }




