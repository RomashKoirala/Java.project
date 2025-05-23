public class Messaging_service {

    public static void main(String[] args) {
        Email email= new Email();
        email.printConnection();
        email.print();
        SMS sms = new SMS();
        sms.printConnection();
        sms.print();
    }

}
