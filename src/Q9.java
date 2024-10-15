import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string in uppercase: ");
        String input = scanner.nextLine();

        // Convert the string to lowercase
        String lowerCaseOutput = input.toLowerCase();

        // Display the result
        System.out.println("Converted to lowercase: " + lowerCaseOutput);

        // Close the scanner
        scanner.close();
    }
}

