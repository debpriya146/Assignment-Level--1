import java.util.Scanner;

public class TechNumber{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isTechNumber(number)) {
            System.out.println(number + " is a Tech Number.");
        } else {
            System.out.println(number + " is not a Tech Number.");
        }

        scanner.close();
    }

    public static boolean isTechNumber(int number) {
        String numStr = Integer.toString(number);
        
       
        if (numStr.length() % 2 != 0) {
            return false;
        }

       
        int mid = numStr.length() / 2;
        int firstHalf = Integer.parseInt(numStr.substring(0, mid));
        int secondHalf = Integer.parseInt(numStr.substring(mid));

      
        int sum = firstHalf + secondHalf;
        int squareOfSum = sum * sum;
        return squareOfSum == number;
    }
}
