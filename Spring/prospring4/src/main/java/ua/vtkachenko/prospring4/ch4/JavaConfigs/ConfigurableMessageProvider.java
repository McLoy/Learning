package ua.vtkachenko.prospring4.ch4.JavaConfigs;

import ua.vtkachenko.prospring4.ch3.MessageProvider;

/**
 * @author Vladyslav T
 * @version 1.0
 */

public class ConfigurableMessageProvider implements MessageProvider {
    private String message = "Default message";

    public ConfigurableMessageProvider(){

    }

    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
