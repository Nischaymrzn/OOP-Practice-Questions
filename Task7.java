// 7. Design and implement a simple Java application that prompts the user to enter a string within a specified length, for example, between 5 and 20 characters. 
//Your application should throw and handle a custom exception if the user enters a string outside this length.
// InvalidStringLengthException:
// A custom exception that is thrown when the user enters a string with a length outside the valid range (5 to 20 characters).
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string between 5 to 20 characters:");
        String string = sc.nextLine();
        
        try {
            if (string.length() < 5 || string.length() > 20) {
                throw new InvalidStringLengthException("String must be between 5 to 20 characters");
            }
            System.out.println("Valid input: " + string);
        } catch (InvalidStringLengthException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
        
        sc.close();
    }
}

class InvalidStringLengthException extends Exception {
    public InvalidStringLengthException(String message) {
        super(message);
    }
}