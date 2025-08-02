/**
 * FibonacciSeries - Prints the Fibonacci sequence up to a user-specified count
 * The Fibonacci sequence is a series where each number is the sum of the two preceding ones.
 * Series starts: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 * 
 * Concepts demonstrated:
 * - Scanner class for user input
 * - While loop for sequence generation
 * - Variable manipulation and arithmetic operations
 * - Basic output formatting
 */
public class FibonacciSeries {
    /**
     * Main method - the entry point of the Java application
     * @param args - command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Create a Scanner object to read user input from console
        java.util.Scanner obj = new java.util.Scanner(System.in);
        
        // Prompt the user to enter the count of Fibonacci numbers to display
        System.out.println("Enter a number: ");

        // Read the count from user input
        int num = obj.nextInt();
        
        // Initialize variables for Fibonacci sequence generation
        int count = 0;          // Counter to track how many numbers we've printed
        int firstTerm = 0;      // First term of the sequence
        int secondTerm = 1;     // Second term of the sequence
        int sum = 0;            // Current Fibonacci number to print

        // Generate and print Fibonacci sequence
        while (count != num) {
            // Print the current Fibonacci number
            System.out.println(sum);
            
            // Calculate the next Fibonacci number
            sum = firstTerm + secondTerm;
            
            // Update terms for next iteration
            firstTerm = secondTerm;
            secondTerm = sum;
            
            // Increment counter
            count++;
        }
        
        // Close the Scanner to free up resources (good practice)
        obj.close();
    }
}
