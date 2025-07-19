/**
 * ReverseNumber2 - Reverses the digits of a number using command line input
 * This is an enhanced version that accepts user input via command line arguments
 * 
 * Examples: 
 * - Input: 12345 → Output: 54321
 * - Input: 9876 → Output: 6789
 * - Input: 100 → Output: 1 (leading zeros are dropped)
 * 
 * Usage: java ReverseNumber2 <number>
 * Example: java ReverseNumber2 15385
 * 
 * Algorithm:
 * 1. Parse command line input to get the number
 * 2. Extract digits one by one from right to left using modulo
 * 3. Build the reversed number by shifting digits left and adding new digit
 * 4. Continue until all digits are processed
 */
public class ReverseNumber2 {
	/**
	 * Main method - entry point of the program
	 * @param args - command line arguments (expects one integer argument)
	 */
	public static void main(String[] args) {
		// Parse the first command line argument from String to int
		// args[0] contains the number to be reversed
		int num = Integer.parseInt(args[0]);

		// Initialize the reversed number to 0
		// This will accumulate the digits in reverse order
		int reverse = 0;

		// Continue processing until no digits remain
		// Each iteration extracts one digit and adds it to reversed number
		while(num != 0) {
			// Extract the rightmost digit using modulo operator
			// Example: 15385 % 10 = 5, 1538 % 10 = 8, etc.
			int digit = num % 10;

			// Build reversed number: shift existing digits left and add new digit
			// Example: reverse=0, digit=5 → reverse=5
			//         reverse=5, digit=8 → reverse=58
			//         reverse=58, digit=3 → reverse=583, etc.
			reverse = reverse * 10 + digit;

			// Remove the rightmost digit using integer division
			// Example: 15385 → 1538 → 153 → 15 → 1 → 0
			num /= 10;
		}
		
		// Display the reversed number
		System.out.println(reverse);
	}
}