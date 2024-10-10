//Q.2.Write a program to demonstrate the constructor based dependency injection.

package MVcSpring.Assignment;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Email sent to " + receiver + " with message: " + message);
    }
}
