package ua.vtkachenko.prospring4.ch4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.File;

public class ResourceDemo {
    public static void main(String[] args) throws Exception{
        ApplicationContext ctx = new ClassPathXmlApplicationContext();
        File file = File.createTempFile("test", ".txt");
        file.deleteOnExit();

        System.out.println(file.getPath());
        Resource res1 = ctx.getResource("file://" + file.getPath());
        displayInfo(res1);

        Resource res2 = ctx.getResource("classpath:test.txt");
        displayInfo(res2);

        Resource res3 = ctx.getResource("http://google.com");
        displayInfo(res3);
    }

    private static void displayInfo(Resource res) throws Exception{
        System.out.println(res.getClass());
        try {
            System.out.println(res.getURL().getContent());
        } catch (Exception ex) {
            System.out.println("We have exception here " + ex.getMessage());
        }
        System.out.println("");
    }
}
