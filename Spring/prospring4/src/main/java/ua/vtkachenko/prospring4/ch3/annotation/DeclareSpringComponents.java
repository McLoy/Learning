package ua.vtkachenko.prospring4.ch3.annotation;

import org.springframework.context.support.GenericXmlApplicationContext;
import ua.vtkachenko.prospring4.ch3.MessageProvider;
import ua.vtkachenko.prospring4.ch3.MessageRenderer;

/**
 * @author Vladyslav T
 * @version 1.0
 */
public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-annotation.xml");
        ctx.refresh();
//        MessageRenderer messageRenderer = ctx.getBean("messageRenderer", MessageRenderer.class);
//        messageRenderer.render();
        MessageProvider messageProvider = ctx.getBean("messageProvider", MessageProvider.class);
        System.out.println(messageProvider.getMessage());
    }
}
