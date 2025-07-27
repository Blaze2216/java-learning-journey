/**
 * Prime - A program to check if a number is prime using user input
 * This program demonstrates prime number checking algorithm with
 * user input and divisor counting method.
 * 
 * Concepts demonstrated:
 * - Scanner class for user input
 * - For loops with counter variables
 * - Modulo operator for divisibility checking
 * - Conditional statements (if-else)
 * - Prime number mathematical logic
 * - Counter/accumulator pattern
 */
public class Prime {
    /**
     * Main method - the entry point of the Java application
     * @param args - command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Create a Scanner object to read user input from console
        java.util.Scanner obj = new java.util.Scanner(System.in);
        
        // Prompt the user to enter a number to check
        System.out.println("Enter a number: ");

        // Read the number from user input
        int num = obj.nextInt();
        
        // Initialize counter to count the number of divisors
        int counter = 0;

        // Loop through all numbers from 1 to num to count divisors
        for(int i = 1; i <= num; i++) {
            // Check if 'i' is a divisor of 'num'
            if(num % i == 0) {
                counter++; // Increment counter for each divisor found
            }
        }
        
        // Prime number has exactly 2 divisors: 1 and itself
        if(counter == 2) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is Not a prime number");
        }
        
        // Close the Scanner to free up resources (good practice)
        obj.close();
    }
}
