//Q.3.Write a program to demonstrate the object based dependency injection and also implement inner bean concept in your spring beans configuration file.
package MVcSpring.Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1_2 {
 public static void main(String[] args) {
     // Load the Spring context
     ApplicationContext context = new ClassPathXmlApplicationContext("MVcSpring/Assignment/beans.xml");

     // Retrieve the MessageProcessor bean
     MessageProcessor messageProcessor = (MessageProcessor) ((AbstractApplicationContext) context).getBean("messageProcessor");

     // Use the MessageProcessor to send a message
     messageProcessor.processMessage("Hello, Dependency Injection with Spring!", "john.doe@example.com");
 }
}
