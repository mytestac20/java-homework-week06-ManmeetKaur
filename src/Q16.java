public class Q16{
        public static void main(String[] args) {
            // Instead of taking input from the user, we can directly assign the binary numbers
            String firstBinary = "10"; // First binary number
            String secondBinary = "11"; // Second binary number

            // Convert binary strings to integers
            int num1 = Integer.parseInt(firstBinary, 2);
            int num2 = Integer.parseInt(secondBinary, 2);

            // Add the two numbers
            int sum = num1 + num2;

            // Convert the sum back to binary
            String binarySum = Integer.toBinaryString(sum);

            // Output the result
            System.out.println("Input first binary number: " + firstBinary);
            System.out.println("Input second binary number: " + secondBinary);
            System.out.println("Sum of two binary numbers: " + binarySum);
        }
    }

