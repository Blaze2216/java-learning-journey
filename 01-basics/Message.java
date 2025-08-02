/**
 * Message - A program to demonstrate user input in Java
 * This program shows how to read user input using Scanner class
 * and display a personalized message to the user.
 * 
 * Concepts demonstrated:
 * - Scanner class for user input
 * - String variables
 * - Basic input/output operations
 * - Using System.in for console input
 */
public class Message {
    /**
     * Main method - the entry point of the Java application
     * @param args - command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Create a Scanner object to read user input from console
        java.util.Scanner obj = new java.util.Scanner(System.in);
        
        // Prompt the user to enter a message
        System.out.println("Enter your message: ");

        // Read the entire line of input from the user
        String message = obj.nextLine();
        
        // Display the user's message with a personalized greeting
        System.out.println("Your message to everyone: " + message);
        
        // Close the Scanner to free up resources (good practice)
        obj.close();
    }
}
