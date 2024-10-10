//Q.3.Write a program to demonstrate the object based dependency injection and also implement inner bean concept in your spring beans configuration file.
package MVcSpring.Assignment;

public class EmailService1 implements MessageService {
 @Override
 public void sendMessage(String message, String recipient) {
     System.out.println("Email sent to " + recipient + " with Message: " + message);
 }
}
