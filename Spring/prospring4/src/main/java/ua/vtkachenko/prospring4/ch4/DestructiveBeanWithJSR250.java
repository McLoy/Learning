package ua.vtkachenko.prospring4.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.File;

/**
 * @author Vladyslav T
 * @version 1.0
 */
public class DestructiveBeanWithJSR250
{
    private File file;
    private String filePath;
    @PostConstruct
    public void afterPropertiesSet() throws Exception
    {
        if (filePath == null)
        {
            throw new IllegalArgumentException("You must specify the filePath property of " + DestructiveBeanWithJSR250.class);
        }
        this.file = new File(filePath);
        this.file.createNewFile();
        System.out.println("File exists: " + file.exists());
    }
    @PreDestroy
    public void destroy()
    {
        System.out.println("Destroying bean");
        if (!file.delete())
        {
            System.err.println("ERROR: failed to delete file");
        }
        System.out.println("File exists: " + file.exists());
    }
    public void setFilePath(String filePath)
    {
        this.filePath = filePath;
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-annotation.xml");
        ctx.refresh();

        DestructiveBeanWithJSR250 bean = (DestructiveBeanWithJSR250) ctx.getBean("destructiveBean");
        System.out.println("Calling destroy");
        ctx.destroy();
        System.out.println("Called destroy");

    }
}
