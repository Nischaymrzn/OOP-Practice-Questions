// 8. Design and implement a simple Java application that prompts the user to enter a valid email address. Your application should throw and handle a custom exception 
//if the user enters an invalid email address.
// InvalidEmailException:
// A custom exception that is thrown when the user enters an email address that does not match a valid email pattern (e.g., it should contain '@' and '.' characters).
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a email:");
        String email = sc.nextLine();
        sc.close();
        try{

       
        if (!email.contains("@") || !email.contains(".")){
            throw new InvalidEmailException("It must contain @ and .");
        }
        System.out.println("Valid email: "+email);
    }catch(InvalidEmailException e){
        System.out.println("Invalid email: "+e.getMessage());
    }
    }

}
class InvalidEmailException extends Exception{
    public InvalidEmailException(String message){
        super(message);
    }
}