/**
 * OddEven - Determines if a number is odd or even
 * This program demonstrates the use of:
 * - Modulo operator (%) for finding remainders
 * - Ternary operator (? :) for conditional assignment
 */
public class OddEven {
	/**
	 * Main method - entry point of the program
	 * @param args - command line arguments (not used)
	 */
	public static void main(String[] args) {
		// The number we want to check (hardcoded for now)
		int num = 3;

		// Using ternary operator: condition ? value_if_true : value_if_false
		// num % 2 gives remainder when divided by 2
		// If remainder is 0, number is even; otherwise it's odd
		System.out.println((num % 2 == 0) ? "Even" : "Odd");		
	}
}
