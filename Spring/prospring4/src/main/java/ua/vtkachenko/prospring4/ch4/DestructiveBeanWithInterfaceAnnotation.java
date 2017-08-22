package ua.vtkachenko.prospring4.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.File;

/**
 * @author Vladyslav T
 * @version 1.0
 */
public class DestructiveBeanWithInterfaceAnnotation {

        private File file;
        private String filePath;

        @PreDestroy
        public void destroy() throws Exception {
            System.out.println("Destroying bean");
            if (!file.delete())
            {
                System.err.println("Error: failed to delete file.");
            }
            System.out.println("File exists: " + file.exists());
        }

        @PostConstruct
        public void afterPropertiesSet() throws Exception {
            System.out.println("Initializing bean");
            if (filePath == null)
            {
                throw new IllegalArgumentException("You must specify the filePath property of " + DestructiveBeanWithInterfaceAnnotation.class);
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
            ctx.load("classpath:META-INF/spring/app-context-annotation.xml");
            ctx.registerShutdownHook();
            ctx.refresh();

            DestructiveBeanWithInterfaceAnnotation bean = (DestructiveBeanWithInterfaceAnnotation) ctx.getBean("destructiveBean");
        }

}
