package ua.vtkachenko.prospring4.ch4;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.File;

/**
 * @author Vladyslav T
 * @version 1.0
 */
public class DestructiveBeanWithInterface implements InitializingBean, DisposableBean {
    private File file;
    private String filePath;

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying bean");
        if (!file.delete())
        {
            System.err.println("Error: failed to delete file.");
        }
        System.out.println("File exists: " + file.exists());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing bean");
        if (filePath == null)
        {
            throw new IllegalArgumentException("You must specify the filePath property of " + DestructiveBeanWithInterface.class);
        }
        this.file = new File(filePath);
        this.file.createNewFile();
        System.out.println("File exists: " + file.exists());
    }

    public void setFilePath(String filePath)
    {
        this.filePath = filePath;
    }

    public static void main(String[] args) throws Exception
    {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:META-INF/spring/app-context-xml.xml");
        ctx.refresh();

        DestructiveBeanWithInterface bean = (DestructiveBeanWithInterface) ctx.getBean("destructiveBean");
        System.out.println("Calling destroy");
        ctx.destroy();
        System.out.println("Called destroy");
    }
}
