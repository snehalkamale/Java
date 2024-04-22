package wiproproject;
import java.util.Arrays;

public class Fibonacci {
	public static void main(String[] args) {
		
        int n = 10; 
        int[] fibonacciArray = new int[n];
	        generateFibonacci(fibonacciArray, n);
        System.out.println("First " + n + " elements of Fibonacci sequence:");
        System.out.println(Arrays.toString(fibonacciArray));
         int nth = 4; 
        int result = findNthFibonacci(nth);
        System.out.println("The " + nth + "th element of Fibonacci sequence: " + result);
    }
    public static void generateFibonacci(int[] fibonacciArray, int n) {
        for (int i = 0; i < n; i++) {
            fibonacciArray[i] = fibonacci(i);
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static int findNthFibonacci(int n) {
        return fibonacci(n - 1); 
    }
}
