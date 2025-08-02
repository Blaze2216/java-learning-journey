# Loops

This folder contains programs that demonstrate repetitive operations in Java.

## Programs

### IsPrime.java
- **Purpose**: Check if a number is prime
- **Concepts**: 
  - For loops
  - Counter variables
  - Mathematical logic for prime numbers

### Palindrome.java
- **Purpose**: Check if a number reads the same forwards and backwards
- **Concepts**: 
  - While loops
  - Number manipulation (extracting digits)
  - Variable preservation

### ReverseNumber.java
- **Purpose**: Reverse the digits of a number
- **Concepts**: 
  - While loops
  - Mathematical operations (modulo and division)
  - Building numbers digit by digit

### Factorial.java
- **Purpose**: Calculate the factorial of a number (n!)
- **Concepts**: 
  - For loops with accumulator pattern
  - Mathematical calculations
  - Multiplicative operations

### Prime.java (with user input)
- **Purpose**: Check if a user-entered number is prime using divisor counting
- **Concepts**: 
  - Scanner class for user input
  - For loops with counter variables
  - Modulo operator for divisibility checking
  - Prime number algorithm with divisor counting
  - Interactive user experience

## Key Learning Points

1. **Prime Number Logic**: A prime number has exactly 2 divisors (1 and itself)
2. **Digit Extraction**: Use `num % 10` to get the last digit
3. **Digit Removal**: Use `num /= 10` to remove the last digit
4. **Number Building**: `result = result * 10 + digit`
5. **Factorial Pattern**: Use accumulator pattern with multiplication
6. **Loop Initialization**: Always initialize accumulator variables properly

## Algorithm Patterns

### Number Reversal Pattern
```java
while(num != 0) {
    int digit = num % 10;        // Extract last digit
    reversed = reversed * 10 + digit;  // Build reversed number
    num /= 10;                   // Remove last digit
}
```

## Next Steps

- Add user input functionality
- Optimize prime checking algorithm
- Handle edge cases (negative numbers, zero)
- Add multiple test cases
