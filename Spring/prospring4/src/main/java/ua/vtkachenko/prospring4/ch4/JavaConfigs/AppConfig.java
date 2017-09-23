package ua.vtkachenko.prospring4.ch4.JavaConfigs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import ua.vtkachenko.prospring4.ch3.MessageProvider;

@Configuration
@ImportResource(value="classpath:META-INF/spring/app-context-xml.xml")
@PropertySource(value="classpath:message.properties")
@ComponentScan(basePackages = "ua.vtkachenko.prospring4.ch4.JavaConfigs")
@EnableTransactionManagement
public class AppConfig { //Something wrong here, works but output differ from books example

    @Autowired
    Environment env;

    @Bean
    @Lazy(value = true)
    public MessageProvider messageProvider(){
        return new ConfigurableMessageProvider(env.getProperty("message"));
    }

    @Bean(name = "messageRenderer")
    @Scope(value = "prototype")
    @DependsOn(value = "messageProvider")
    public MessageRenderer messageRenderer(){
        MessageRenderer renderer = new StandardOutMessageRenderer();
        renderer.setMessageProvider(messageProvider());

        return renderer;
    }
}
