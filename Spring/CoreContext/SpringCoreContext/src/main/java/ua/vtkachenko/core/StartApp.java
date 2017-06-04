package ua.vtkachenko.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Starting point of application
 *
 * @author Vladyslav T
 * @version 1.0
 */

public class StartApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        obj.printHello();
    }
}
