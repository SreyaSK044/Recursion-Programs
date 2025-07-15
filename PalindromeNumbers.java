//Check if a number is palindrome

public class PalindromeNumbers {
    static int reverse(int n, int rev) {
        if (n == 0) return rev;
        return reverse(n / 10, rev * 10 + n % 10);
    }

    static boolean isPalindrome(int n) {
        return n == reverse(n, 0);
    }

    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num));
    }
}

