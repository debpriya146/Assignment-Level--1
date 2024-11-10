import java.util.Scanner;

public class DuckNumber
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();  // Read input as string to handle leading zeros
        
        if (isDuckNumber(number)) {
            System.out.println(number + " is a Duck Number.");
        } else {
            System.out.println(number + " is not a Duck Number.");
        }

        scanner.close();
    }

    public static boolean isDuckNumber(String number) {
        // Check if the first character is '0', if so, it's not a Duck Number
        if (number.charAt(0) == '0') {
            return false;
        }
        
       
        for (int i = 1; i < number.length(); i++) {
            if (number.charAt(i) == '0') {
                return true;  
            }
        }
        
        return false;  
    }
}
