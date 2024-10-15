import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two variables
        System.out.print("Enter the first variable (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second variable (b): ");
        int b = scanner.nextInt();

        // Display the values before swapping
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap the variables
        int temp = a; // Store the value of a in a temporary variable
        a = b;        // Assign the value of b to a
        b = temp;     // Assign the value of temp (original a) to b

        // Display the values after swapping
        System.out.println("After swapping: a = " + a + ", b = " + b);

        // Close the scanner
        scanner.close();
    }
}

