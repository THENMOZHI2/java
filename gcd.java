import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        // Creating scanner object for user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
          int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int gcd = calculategcd(n1, n2);
        System.out.println("The GCD of " + n1 + " and " + n2 + " is: " + gcd);

    }

    public static int calculategcd(int a, int b) {

        while (b != 0) {
            int temp=b;
            b = a % b;
            a = temp;
        }
        return a;

    }
}
