/**
 * Numbers - A program to print numbers from 1 to a user-specified value
 * This program demonstrates basic user input and loop iteration in Java.
 * 
 * Concepts demonstrated:
 * - Scanner class for user input
 * - For loop for iteration
 * - Basic output formatting
 * - Using short data type for smaller numbers
 */
public class Numbers {
    /**
     * Main method - the entry point of the Java application
     * @param args - command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Create a Scanner object to read user input from console
        java.util.Scanner obj = new java.util.Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter a number: ");

        // Read the number from user input using short data type
        short num = obj.nextShort();

        // Loop from 1 to the entered number (inclusive)
        for (int i = 1; i <= num; i++) {
            // Print each number on a new line
            System.out.println(i);
        }
        
        // Close the Scanner to free up resources (good practice)
        obj.close();
    }
}
