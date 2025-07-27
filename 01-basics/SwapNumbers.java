/**
 * SwapNumbers - A program to demonstrate variable swapping in Java
 * This program shows how to swap the values of two variables using
 * a temporary variable and demonstrates basic variable manipulation.
 * 
 * Concepts demonstrated:
 * - Scanner class for user input
 * - Integer variables and assignment
 * - Variable swapping technique with temporary variable
 * - Multiple input reading with nextInt()
 * - Basic output formatting
 */
public class SwapNumbers {
    /**
     * Main method - the entry point of the Java application
     * @param args - command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Create a Scanner object to read user input from console
        java.util.Scanner obj = new java.util.Scanner(System.in);
        
        // Prompt the user to enter two numbers
        System.out.println("Enter two numbers: ");

        // Read the first number from user input
        int num1 = obj.nextInt();
        // Read the second number from user input
        int num2 = obj.nextInt();

        // Display the original values entered by the user
        System.out.println("You entered Num1: " + num1 + " and Num2: " + num2);

        // Swapping logic using a temporary variable
        // Step 1: Store num1 in temporary variable
        int temp = num1;
        // Step 2: Assign num2 value to num1
        num1 = num2;
        // Step 3: Assign temp (original num1) to num2
        num2 = temp;

        // Display the swapping process and final result
        System.out.println("Swapping numbers...........");
        System.out.println("After swapping - Num1 = " + num1 + ", Num2 = " + num2);
        
        // Close the Scanner to free up resources (good practice)
        obj.close();
    }
}
