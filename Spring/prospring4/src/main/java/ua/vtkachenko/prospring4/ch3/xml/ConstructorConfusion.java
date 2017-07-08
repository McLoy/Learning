package ua.vtkachenko.prospring4.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.lang.reflect.Constructor;

/**
 * @author Vladyslav T
 * @version 1.0
 */
public class ConstructorConfusion {
    private String someValue;

    public ConstructorConfusion(String someValue) {
        System.out.println("ConstructorConfusion(String) called");
        this.someValue = someValue;
    }
    public ConstructorConfusion(int someValue) {
        System.out.println("ConstructorConfusion(int) called");
        this.someValue = "Number: " + Integer.toString(someValue);
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-xml.xml");
        ctx.refresh();
        ConstructorConfusion cc = (ConstructorConfusion) ctx.getBean("constructorConfusion");
        System.out.println(cc);
    }

    @Override
    public String toString() {
        return someValue; //Constructor Injection:constructor confusion
    }
}
