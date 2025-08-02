# Java Basics

This folder contains fundamental Java programs that introduce core concepts.

## Programs

### HelloWorld.java
- **Purpose**: The traditional first program in any language
- **Concepts**: 
  - Basic Java syntax
  - `System.out.println()` for output
  - Class structure
  - Main method

**How to run:**
```bash
javac HelloWorld.java
java HelloWorld
```

**Expected Output:**
```
Hello World!
```

### Message.java
- **Purpose**: Demonstrates user input and basic string handling
- **Concepts**: 
  - Scanner class for user input
  - String variables and operations
  - Reading from System.in
  - Resource management (closing Scanner)

**How to run:**
```bash
javac Message.java
java Message
```

**Expected Output:**
```
Enter your message: 
Hello Java World!
Your message to everyone: Hello Java World!
```

### SwapNumbers.java
- **Purpose**: Demonstrates variable swapping and manipulation
- **Concepts**: 
  - Scanner class for multiple integer inputs
  - Variable assignment and manipulation
  - Temporary variable technique for swapping
  - `nextInt()` for reading integers
  - Basic mathematical operations

**How to run:**
```bash
javac SwapNumbers.java
java SwapNumbers
```

**Expected Output:**
```
Enter two numbers: 
5 10
You entered Num1: 5 and Num2: 10
Swapping numbers...........
After swapping - Num1 = 10, Num2 = 5
```

## Key Learning Points

1. Every Java program must have a `main` method
2. Java is case-sensitive
3. Classes must be saved in files with the same name (case-sensitive)
4. `System.out.println()` prints text and adds a new line
5. `Scanner` class is used to read user input from console
6. Always close Scanner objects to free up system resources
7. `nextLine()` reads an entire line including spaces
8. `nextInt()` reads integer values from user input
9. Variable swapping requires a temporary variable to avoid data loss
10. Multiple inputs can be read sequentially with Scanner methods
