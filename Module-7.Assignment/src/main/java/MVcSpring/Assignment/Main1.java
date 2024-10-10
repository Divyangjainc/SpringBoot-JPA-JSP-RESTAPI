package MVcSpring.Assignment;

//Main Class
public class Main1 {
 public static void main(String[] args) {
     // Create the service
     MessageService emailService = new EmailService();

     // Inject the service into the client
     MessageProcessor messageProcessor = new MessageProcessor(emailService);

     // Use the client to process the message
     messageProcessor.processMessage("Hello, Dependency Injection!", "john.doe@example.com");
 }
}
