import java.util.Scanner;
public class MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Magic Number: ");
        int number = scanner.nextInt();

        if (isMagicNumber(number)) {
            System.out.println(number + " is a Magic Number.");
        } else {
            System.out.println(number + " is not a Magic Number.");
        }
    }
    public static boolean isMagicNumber(int num) {
        while (num >= 10) {
            num = sumOfDigits(num);  
        }
        return num == 1;
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


