package ua.vtkachenko.prospring4.ch3.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author Vladyslav T
 * @version 1.0
 */
@Service("injectSimple")
public class InjectSimple {
    @Value("Chris Schafaer")
    private String name;
    @Value("32")
    private int age;
    @Value("178")
    private float height;
    @Value("true")
    private boolean programmer;
    @Value("1009843200")
    private Long ageInSeconds;

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-annotation.xml");
        ctx.refresh();
        InjectSimple simple = (InjectSimple) ctx.getBean("injectSimple");
        System.out.println(simple);
    }

    @Override
    public String toString() {
        return "Name='" + name + '\n' +
                "age=" + age + '\n' +
                "height=" + height + '\n' +
                "programmer=" + programmer + '\n' +
                "ageInSeconds=" + ageInSeconds;
    }
}
