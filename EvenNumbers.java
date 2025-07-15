//Print Even Numbers from 2 to N

public class EvenNumbers {
    static void printEven(int n, int i) {
        if (i > n) return;
        if (i % 2 == 0) System.out.println(i);
        printEven(n, i + 1);
    }
    public static void main(String[] args) {
        printEven(10, 2);
    }
}
