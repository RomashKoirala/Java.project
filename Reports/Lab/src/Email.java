
import java.util.Scanner;


public class Email implements Messaging {
     Scanner scanner = new Scanner(System.in);
    @Override
    public void getMessage() {
        System.out.println("Enter your message:");
        String message = scanner.nextLine();
        System.out.println("You entered: " + message);
    }
    @Override
    public void getRecipient(){
        System.out.println("Enter your Email");
        String recipit =scanner.nextLine();
        System.out.println("Your email is \n"+recipit);


    }
     public void closeScanner() {
        scanner.close();
    }
    @Override
    public void print(){
        getMessage();
        getRecipient();
    }

}
