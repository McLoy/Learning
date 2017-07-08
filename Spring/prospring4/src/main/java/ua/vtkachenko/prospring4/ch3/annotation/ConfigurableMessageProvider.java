package ua.vtkachenko.prospring4.ch3.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ua.vtkachenko.prospring4.ch3.MessageProvider;

/**
 * @author Vladyslav T
 * @version 1.0
 */
@Service("messageProvider")
public class ConfigurableMessageProvider implements MessageProvider {
    private String message;

//    @Autowired
//    public ConfigurableMessageProvider(@Value("Configurable message, using @Value annotation.") String message) { //Hardcore assigninng of text
//        this.message = message;
//    }
    @Autowired
    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
