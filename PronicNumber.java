import java.util.Scanner;
public class PronicNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Pronic Number: ");
        int number = scanner.nextInt();

        if (isPronicNumber(number)) {
            System.out.println(number + " is a Pronic Number.");
        } else {
            System.out.println(number + " is not a Pronic Number.");
        }
    }
    public static boolean isPronicNumber(int num) {
        for (int x = 0; x * (x + 1) <= num; x++) {
            if (x * (x + 1) == num) {
                return true; 
            }
        }
        return false;  
    }
}

