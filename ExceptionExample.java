import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Demonstrating ArithmeticException
        try {
            System.out.print("Enter a number to divide 100: ");
            int divisor = scanner.nextInt();
            int result = 100 / divisor;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        // Demonstrating ArrayIndexOutOfBoundsException
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            System.out.print("Enter an index to access the array (0-4): ");
            int index = scanner.nextInt();
            System.out.println("Value at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds.");
        }

        // Close the scanner
        scanner.close();
    }
}