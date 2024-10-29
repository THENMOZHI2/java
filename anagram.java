import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    // Method to check if two strings are anagrams
    public static boolean isanagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        // Sort both character arrays
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Check if the sorted arrays are equal
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        // Creating scanner object for user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        // Check if the two strings are anagrams
        if (isanagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }

        sc.close(); // Closing scanner to avoid resource leak
    }
}
