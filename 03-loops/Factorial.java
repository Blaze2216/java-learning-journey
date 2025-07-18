/**
 * Factorial - Calculates the factorial of a number
 * Factorial of n (written as n!) is the product of all positive integers from 1 to n
 * Examples: 5! = 5 × 4 × 3 × 2 × 1 = 120
 *          4! = 4 × 3 × 2 × 1 = 24
 *          0! = 1 (by definition)
 * 
 * Algorithm: Use a loop to multiply all numbers from 1 to n
 */
public class Factorial {
	/**
	 * Main method - entry point of the program
	 * @param args - command line arguments (not used)
	 */
	public static void main(String[] args) {
		// The number for which we want to calculate factorial
		int num = 5;
		
		// Initialize factorial to 1 (multiplicative identity)
		// Starting with 1 because multiplying by 1 doesn't change the result
		int factorial = 1;

		// Loop from 1 to num (inclusive) to calculate factorial
		// Each iteration multiplies the current factorial by the loop counter
		for(int i = 1; i <= num; i++) {
			// Multiply factorial by current number
			// Step by step: 1*1=1, 1*2=2, 2*3=6, 6*4=24, 24*5=120
			factorial *= i;  // Same as: factorial = factorial * i;
		}
		
		// Display the calculated factorial
		// For num=5, this will output: 120
		System.out.println(factorial);
	}
}