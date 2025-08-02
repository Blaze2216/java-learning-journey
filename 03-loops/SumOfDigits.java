/**
 * SumOfDigits - Calculates the sum of all digits in a user-entered number
 * This program demonstrates digit extraction and accumulation using loops.
 * Example: For input 1234, output would be 1+2+3+4 = 10
 * 
 * Concepts demonstrated:
 * - Scanner class for user input
 * - While loop for iteration
 * - Modulo operator (%) for digit extraction
 * - Integer division (/) for digit removal
 * - Variable accumulation
 */
public class SumOfDigits {
    /**
     * Main method - the entry point of the Java application
     * @param args - command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Create a Scanner object to read user input from console
        java.util.Scanner obj = new java.util.Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter a number: ");

        // Read the number from user input
        int num = obj.nextInt();
        
        // Initialize sum to accumulate the digits
        int sum = 0;

        // Extract and sum each digit while the number is not zero
        while (num != 0) {
            // Extract the rightmost digit using modulo operator
            int digit = num % 10;
            
            // Add the extracted digit to the sum
            sum += digit;
            
            // Remove the rightmost digit by integer division
            num /= 10;
        }
        
        // Display the sum of all digits
        System.out.println(sum);
        
        // Close the Scanner to free up resources (good practice)
        obj.close();
    }
}
