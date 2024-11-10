import java.util.Scanner;
public class DudeneyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Dudeney Number: ");
        int number = scanner.nextInt();

        if (isDudeneyNumber(number)) {
            System.out.println(number + " is a Dudeney Number.");
        } else {
            System.out.println(number + " is not a Dudeney Number.");
        }
    }

    public static boolean isDudeneyNumber(int num) {
        
        int cubeRoot = (int) Math.cbrt(num);
        int sumOfDigits = sumOfDigits(num);
        return sumOfDigits == cubeRoot;
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
