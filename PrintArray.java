//Print all elements of an array using recursion

public class PrintArray {
    static void printElements(int[] arr, int index) {
        if (index == arr.length) return;
        System.out.println(arr[index]);
        printElements(arr, index + 1);
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        printElements(arr, 0);
    }
}
