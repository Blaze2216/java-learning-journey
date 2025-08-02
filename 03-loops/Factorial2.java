/**
 * Factorial2 - Calculates factorial using command line arguments
 * This is an enhanced version of Factorial that accepts user input via command line
 * 
 * Factorial of n (written as n!) = n × (n-1) × (n-2) × ... × 2 × 1
 * Examples: 5! = 5 × 4 × 3 × 2 × 1 = 120
 *          6! = 6 × 5 × 4 × 3 × 2 × 1 = 720
 * 
 * Usage: java Factorial2 <number>
 * Example: java Factorial2 5
 * 
 * Algorithm: Parse command line input, then use loop to calculate factorial
 */
public class Factorial2 {
	/**
	 * Main method - entry point of the program
	 * @param args - command line arguments (expects one integer argument)
	 */
	public static void main(String[] args) {
		// Parse the first command line argument from String to int
		// args[0] contains the first argument passed when running the program
		// Integer.parseInt() converts the String to an integer
		int num = Integer.parseInt(args[0]);

		// Initialize factorial to 1 (multiplicative identity)
		// This will accumulate the result of our factorial calculation
		int factorial = 1;

		// Loop from 1 to num (inclusive) to calculate factorial
		// Each iteration multiplies factorial by the current number
		for(int i = 1; i <= num; i++) {
			// Multiply factorial by current loop counter
			// Step-by-step for num=5: 1×1=1, 1×2=2, 2×3=6, 6×4=24, 24×5=120
			factorial *= i;  // Same as: factorial = factorial * i;
		}

		// Display the calculated factorial result
		System.out.println(factorial);
	}
}