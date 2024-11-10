import java.util.Scanner;
public class NeonNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Neon Number: ");
        int number = scanner.nextInt();

        if (isNeonNumber(number)) {
            System.out.println(number + " is a Neon Number.");
        } else {
            System.out.println(number + " is not a Neon Number.");
        }
    }

  
    public static boolean isNeonNumber(int num) {
        int square = num * num;  
        int sumOfDigits = sumOfDigits(square);  
        return sumOfDigits == num;
    }

    
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
