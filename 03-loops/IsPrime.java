/**
 * IsPrime - Checks if a number is prime
 * A prime number is a natural number greater than 1 that has no positive 
 * divisors other than 1 and itself.
 * 
 * Algorithm: Count all divisors of the number. If count equals 2, it's prime.
 */
public class IsPrime {
	/**
	 * Main method - entry point of the program
	 * @param args - command line arguments (not used)
	 */
	public static void main(String[] args) {
		// The number to check for primality
		int num = 6;
		
		// Counter to keep track of how many divisors we find
		int count = 0;
		
		// Loop through all numbers from 1 to num (inclusive)
		for(int i = 1; i <= num; i++) {
			// Check if 'i' divides 'num' evenly (remainder is 0)
			if(num % i == 0) {
				count++; // Increment divisor count
			}
		}
		
		// A prime number has exactly 2 divisors: 1 and itself
		if(count == 2){
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}
}
