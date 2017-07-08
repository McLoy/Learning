package ua.vtkachenko.prospring4.ch3.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.vtkachenko.prospring4.ch3.MessageProvider;

/**
 * @author Vladyslav T
 * @version 1.0
 */
public class ConfigurableMessageProvider implements MessageProvider {
    private String message;

    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
