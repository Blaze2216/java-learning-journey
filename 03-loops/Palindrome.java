/**
 * Palindrome - Checks if a number reads the same forwards and backwards
 * Examples of palindromes: 121, 1331, 12321
 * 
 * Algorithm: 
 * 1. Reverse the digits of the number
 * 2. Compare the reversed number with the original
 * 3. If they're equal, it's a palindrome
 */
public class Palindrome {
	/**
	 * Main method - entry point of the program
	 * @param args - command line arguments (not used)
	 */
	public static void main(String[] args) {
		// The number to check for palindrome property
		int num = 123, reversed = 0;
		
		// Store the original number since we'll modify 'num' in the loop
		int original = num;
		
		// Reverse the digits of the number
		while(num != 0) {
			// Extract the last digit using modulo operator
			int digit = num % 10;
			
			// Build the reversed number digit by digit
			// Multiply by 10 to shift digits left, then add new digit
			reversed = reversed * 10 + digit;
			
			// Remove the last digit from num by integer division
			num /= 10;
		}
		
		// Compare original number with its reverse
		if(original == reversed) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
