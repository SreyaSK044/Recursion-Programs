//Product of first N natural Numbers
public class ProductNatural {
    static int product(int n) {
        if (n == 1) return 1;
        return n * product(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(product(3)); 
    }
}

