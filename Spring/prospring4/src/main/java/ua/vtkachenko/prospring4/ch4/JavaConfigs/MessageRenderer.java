package ua.vtkachenko.prospring4.ch4.JavaConfigs;

import ua.vtkachenko.prospring4.ch3.MessageProvider;

/**
 * @author Vladyslav T
 * @version 1.0
 */
public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
