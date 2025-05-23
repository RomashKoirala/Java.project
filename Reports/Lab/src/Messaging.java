
public interface Messaging {

    public void print();    
    public void getRecipient();
    public void getMessage();
    default void printConnection(){
    System.out.println("connection is successful");
    }
}
