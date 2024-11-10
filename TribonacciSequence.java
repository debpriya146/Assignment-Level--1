import java.util.Scanner;
public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms you want in the Tribonacci sequence: ");
        int n = scanner.nextInt();
        System.out.println("Tribonacci Sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(tribonacci(i) + " ");
        }
    }
    public static int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        }
    }
}
