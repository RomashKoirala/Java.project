import java.util.Scanner;

public class SMS implements Messaging{
    
    Scanner scanner = new Scanner(System.in);
    @Override
    public void getMessage(){
        System.out.println("Enter your message:");
        String message = scanner.nextLine();
        System.out.println("You entered: " + message);
    }
    @Override
    public void getRecipient(){
        System.out.println("Enter your numbere");
        String recipient = scanner.nextLine();
     if (recipient.matches("\\d{10}")) {
            System.out.println("Valid phone number"+recipient);
        } else {
            System.out.println("Invalid phone number");
        }

    }
    @Override
    public void print(){
        getRecipient();
        getMessage();
    }

}
