import java.util.Scanner;
public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Armstrong Number: ");
        int number = scanner.nextInt();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }
    }

    public static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int numDigits = String.valueOf(num).length(); 
        int sum = 0;

    
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);  
            num /= 10;
        }

        return sum == originalNum;  
    }
}
