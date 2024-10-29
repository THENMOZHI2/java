import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        // Creating scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int reverse = 0;

        // Loop to reverse the number
        while (n != 0) {
            int a = n % 10;
            reverse = reverse * 10 + a;
            n /= 10;
        }

        // Display the reversed number
        System.out.println("Reversed number: " + reverse);

        // Closing the scanner object
        sc.close();
    }
}
