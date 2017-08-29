package ua.vtkachenko.prospring4.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author Vladyslav T
 * @version 1.0
 */
public class BeanNamePrinterExample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-xml.xml");
        ctx.refresh();

        BeanNamePrinter bean = (BeanNamePrinter) ctx.getBean("beanNamePrinter");
        bean.someOperation();
    }
}
