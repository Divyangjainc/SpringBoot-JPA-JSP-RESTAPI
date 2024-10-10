//Write a program to collect 5 student information using spring collection(List)in spring bean configuration file. 
//Student:o Int id; o String fname, lname, email,mobile.
package MVcSpring.Assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class StudentApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        List<Student> students = (List<Student>) context.getBean("studentList");
        
        for (Student student : students) {
            System.out.println("ID: " + student.getId());
            System.out.println("First Name: " + student.getFname());
            System.out.println("Last Name: " + student.getLname());
            System.out.println("Email: " + student.getEmail());
            System.out.println("Mobile: " + student.getMobile());
            System.out.println("-------------------------------");
        }
    }
}
