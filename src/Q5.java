public class Q5 {

    // Instance method for addition
    public int add(int a, int b) {
        return a + b;
    }

    // Instance method for subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Static method for multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Static method for division
    public static String divide(int a, int b) {
        if (b == 0) {
            return "Division by zero is not allowed.";
        }
        double result = (double) a / b;
        return "Division of " + a + " by " + b + " is: " + result;
    }

    public static void main(String[] args) {
        Q5 calc = new Q5();

        // Using instance methods
        System.out.println("Addition: " + calc.add(10, 5));
        System.out.println("Subtraction: " + calc.subtract(10, 5));

        // Using static methods
        System.out.println("Multiplication: " + Q5.multiply(10, 5));
        System.out.println(Q5.divide(10, 5));
        System.out.println(Q5.divide(10, 0)); // Testing division by zero
    }
}


