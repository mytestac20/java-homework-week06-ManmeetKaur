public class Q14 {
    public static void main(String[] args) {
        // Given width and height
        double width = 5.6;
        double height = 8.5;

        // Calculate area
        double area = width * height;

        // Calculate perimeter
        double perimeter = 2 * (width + height);

        // Display the results
        System.out.printf("Area is %.1f * %.1f = %.2f%n", width, height, area);
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f%n", width, height, perimeter);
    }
}

