//Print Numbers from 1 to N

public class AscendingNumbers {
    static void printAscending(int n, int i) {
        if (i > n) return;
        System.out.println(i);
        printAscending(n, i + 1);
    }
    public static void main(String[] args) {
        printAscending(5, 1);
    }
}
