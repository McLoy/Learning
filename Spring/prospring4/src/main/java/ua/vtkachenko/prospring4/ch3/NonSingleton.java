package ua.vtkachenko.prospring4.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author Vladyslav T
 * @version 1.0
 */
public class NonSingleton {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INf/spring/app-context-xml.xml");
        ctx.refresh();

        String s1 = (String) ctx.getBean("nonSingleton");
        String s2 = (String) ctx.getBean("nonSingleton");

        System.out.println("Identity Equal?: " + (s1 == s2));
        System.out.println("Value Equal:? " + s1.equals(s2));
        System.out.println(s1);
        System.out.println(s2);
    }
}
