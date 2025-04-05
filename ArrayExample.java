import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();
        
        // Create an array of the specified size
        int[] numbers = new int[size];
        
        // Populate the array with user input
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
    
        // Display the elements of the array
        System.out.println("You entered the following numbers:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": " + numbers[i]);
        }
        
        // Calculate the sum and average of the elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / size;
        
        // Display the sum and average
        System.out.println("Sum of the elements: " + sum);
        System.out.println("Average of the elements: " + average);
        
        // Close the scanner
        scanner.close();
    }
}