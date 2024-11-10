import java.util.Scanner;
public class BouncyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Bouncy Number: ");
        int number = scanner.nextInt();

        if (isBouncyNumber(number)) {
            System.out.println(number + " is a Bouncy Number.");
        } else {
            System.out.println(number + " is not a Bouncy Number.");
        }
    }
    public static boolean isBouncyNumber(int num) {
        boolean increasing = false;
        boolean decreasing = false;

        int lastDigit = num % 10;
        num /= 10;
        while (num > 0) {
            int currentDigit = num % 10;

            if (currentDigit < lastDigit) {
                increasing = true;
            } else if (currentDigit > lastDigit) {
                decreasing = true;
            }
            if (increasing && decreasing) {
                return true;
            }

            lastDigit = currentDigit;
            num /= 10;
        }
        return false; 
    }
}
