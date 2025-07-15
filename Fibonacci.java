//Find nth Fibonacci Number

import java.util.Scanner;

public class Fibonacci {

    // Recursive function to return nth Fibonacci number
    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n to find nth Fibonacci number: ");
        int n = sc.nextInt();

        int result = fib(n);

     System.out.println("Fibonacci series up to " + n + ":");
     for (int i = 0; i <= n; i++) {
        System.out.print(fib(i) + " ");
}

    }
}

