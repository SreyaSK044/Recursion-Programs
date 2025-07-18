//Sum of digits of a number

public class SumDigits {
    static int sumDigits(int n) {
        if (n == 0) return 0;
        return n % 10 + sumDigits(n / 10);
    }
    public static void main(String[] args) {
        System.out.println(sumDigits(98)); // 6
    }
}
