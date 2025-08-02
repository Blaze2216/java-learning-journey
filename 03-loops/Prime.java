/**
 * Prime - Checks if a user-entered number is prime
 * A prime number is a natural number greater than 1 that has no positive 
 * divisors other than 1 and itself. Examples: 2, 3, 5, 7, 11, 13, 17, 19, 23...
 * 
 * Concepts demonstrated:
 * - Scanner class for user input
 * - For loop and conditional logic
 * - Boolean variables for flag-based logic
 * - Efficient prime checking algorithm (checking up to n/2)
 * - Basic output formatting
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
        
        // Initialize flag to assume the number is prime
        boolean isPrime = true;

        // Handle special cases: numbers less than or equal to 1 are not prime
        if (num <= 1) {
            isPrime = false;
        } else {
            // Check for divisors from 2 to num/2
            // We only need to check up to num/2 because any divisor greater than
            // num/2 would require a corresponding divisor less than num/2
            for (int i = 2; i <= num / 2; i++) {
                // If num is divisible by i, then it's not prime
                if (num % i == 0) {
                    isPrime = false;
                    break; // Exit loop early since we found a divisor
                }
            }
        }

        // Display the result based on the isPrime flag
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        // Close the Scanner to free up resources (good practice)
        obj.close();
    }
}
