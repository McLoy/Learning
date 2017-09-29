package ua.vtkachenko.prospring4.ch4.UsingGroovyConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

//Not working
public class GroovyBeansFromJava {
    public static void main(String[] args) {
        ApplicationContext context = new GenericGroovyApplicationContext("classpath:beans.groovy");
        Contact contact = context.getBean("contact", Contact.class);
        System.out.println(contact);
    }
}
