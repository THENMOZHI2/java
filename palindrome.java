
import java.util.Scanner;

public class palindrome {
    // Method to check if two strings are anagrams

    public static void main(String[] args) {
        // Creating scanner object for user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();
        String rev = "";
        for (int i = str1.length()- 1; i >=0; i--) {
            rev += str1.charAt(i);
        }

        // Check if the two strings are anagrams
        if (str1.equals(rev)) {
            System.out.println(str1 +" are palindrome");
        } else {
            System.out.println(str1 +" are  not a palindrome");
        }

        sc.close();
    }
}
