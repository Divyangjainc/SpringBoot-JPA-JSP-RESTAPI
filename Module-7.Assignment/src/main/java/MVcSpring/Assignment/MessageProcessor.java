//Q.2.Write a program to demonstrate the constructor based dependency injection.
package MVcSpring.Assignment;

public class MessageProcessor {
    private final MessageService messageService;

    // Constructor-based dependency injection
    public MessageProcessor(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String message, String recipient) {
        // Do some processing if needed
        messageService.sendMessage(message, recipient);
    }
}
