/**
 * ReverseNumber - Reverses the digits of a number
 * Example: Input 15385 → Output 58351
 * 
 * Algorithm:
 * 1. Extract digits one by one from right to left
 * 2. Build the reversed number by appending each digit
 * 3. Continue until all digits are processed
 */
public class ReverseNumber {
	/**
	 * Main method - entry point of the program
	 * @param args - command line arguments (not used)
	 */
	public static void main(String[] args) {
		// The number whose digits we want to reverse
		int num = 15385, reverse = 0;

		// Process each digit until no digits remain
		while(num != 0) {
			// Extract the rightmost digit using modulo operator
			int digit = num % 10;
			
			// Build reversed number: shift existing digits left and add new digit
			// Example: reverse=583, digit=1 → reverse=5831
			reverse = reverse * 10 + digit;
			
			// Remove the rightmost digit using integer division
			// Example: 15385 → 1538 → 153 → 15 → 1 → 0
			num /= 10;
		}
		
		// Display the reversed number
		System.out.println(reverse);
	}
}
