import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        // Creating scanner object for user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n1 = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n1; i++) {
            if (n1 % i == 0) {
                sum += i;

            }
        }
        if (sum == n1) {
            System.out.println("perfect number");
        } else {
            System.out.println(" not perfect number");
        }

    }
}
