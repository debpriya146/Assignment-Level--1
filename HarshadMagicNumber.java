import java.util.Scanner;

public class HarshadMagicNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Harshad Magic Number: ");
        int number = scanner.nextInt();

        if (isHarshadMagicNumber(number)) {
            System.out.println(number + " is a Harshad Magic Number.");
        } else {
            System.out.println(number + " is not a Harshad Magic Number.");
        }
    }

   
    public static boolean isHarshadMagicNumber(int num) {
        
        int sumOfDigits = sumOfDigits(num);
        if (num % sumOfDigits != 0) {
            return false; 
        }

    
        int reducedSum = sumOfDigitsRepeatedly(sumOfDigits(num));

    
        return reducedSum == 1;
    }
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

   
    public static int sumOfDigitsRepeatedly(int n) {
        while (n >= 10) {
            n = sumOfDigits(n);  
        }
        return n;
    }
}
