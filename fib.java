import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        // Creating scanner object for user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms for Fibonacci sequence: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        int c;
        System.out.println(a + " " + b);
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }

    }
}
