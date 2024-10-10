//Q.3.Write a program to demonstrate the object based dependency injection and also implement inner bean concept in your spring beans configuration file.
package MVcSpring.Assignment;

public class MessageProcessor1 {
 private MessageService messageService;

 public void setMessageService(MessageService messageService) {
     this.messageService = messageService;
 }

 public void processMessage(String message, String recipient) {
     messageService.sendMessage(message, recipient);
 }
}
