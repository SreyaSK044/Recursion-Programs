//Print Hello my dear N times using Recursion 

public class HelloRecursion {
    static void printHello(int n) {
        if (n == 0) return;
        System.out.println("Hello my dear");
        printHello(n - 1);
    }
    public static void main(String[] args) {
        printHello(5);
    }
}
