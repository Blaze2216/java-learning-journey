/**
 * Palindrome2 - Checks if a number is a palindrome using command line input
 * A palindrome reads the same forwards and backwards
 * This enhanced version accepts user input via command line arguments
 * 
 * Examples of palindromes:
 * - 121 → reads as 121 (same forwards and backwards)
 * - 1331 → reads as 1331 (palindrome)
 * - 12321 → reads as 12321 (palindrome)
 * - 123 → reverses to 321 (not a palindrome)
 * 
 * Usage: java Palindrome2 <number>
 * Example: java Palindrome2 121
 * 
 * Algorithm:
 * 1. Parse command line input and store original number
 * 2. Reverse the digits of the number
 * 3. Compare original number with reversed number
 * 4. If they match, it's a palindrome; otherwise, it's not
 */
public class Palindrome2 {
	/**
	 * Main method - entry point of the program
	 * @param args - command line arguments (expects one integer argument)
	 */
	public static void main(String[] args) {
		// Parse the first command line argument from String to int
		// This is the number we want to check for palindrome property
		int num = Integer.parseInt(args[0]);

		// Store the original number since we'll modify 'num' during reversal
		// We need to preserve the original value for final comparison
		int original = num;

		// Initialize the reversed number to 0
		// This will accumulate the digits in reverse order
		int reverse = 0;

		// Reverse the digits of the number using the standard algorithm
		// Continue until no digits remain in num
		while(num != 0) {
			// Extract the rightmost digit using modulo operator
			// Example: For 121: first iteration gets 1, second gets 2, third gets 1
			int digit = num % 10;

			// Build reversed number: shift existing digits left and add new digit
			// Example for 121: reverse=0→1, reverse=1→12, reverse=12→121
			reverse = reverse * 10 + digit;

			// Remove the rightmost digit using integer division
			// Example: 121 → 12 → 1 → 0 (loop terminates)
			num /= 10;
		}

		// Compare the original number with its reverse
		// If they are equal, the number reads the same forwards and backwards
		if(original == reverse) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}