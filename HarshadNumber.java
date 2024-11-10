import java.util.Scanner;
public class HarshadNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Harshad Number: ");
        int number = scanner.nextInt();

        if (isHarshadNumber(number)) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }
    }
    public static boolean isHarshadNumber(int num) {
        int sumOfDigits = sumOfDigits(num);  
        return num % sumOfDigits == 0; 
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
