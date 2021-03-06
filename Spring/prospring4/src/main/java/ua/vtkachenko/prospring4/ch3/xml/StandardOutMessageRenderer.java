package ua.vtkachenko.prospring4.ch3.xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.vtkachenko.prospring4.ch3.MessageProvider;
import ua.vtkachenko.prospring4.ch3.MessageRenderer;

/**
 * @author Vladyslav T
 * @version 1.0
 */
@Service("messageRenderer")
public class StandardOutMessageRenderer implements MessageRenderer {
    private MessageProvider messageProvider;
    public void render() {
        if (messageProvider == null){
            throw new RuntimeException("You must set the property messageProvider of class:" +
            StandardOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }
    @Autowired
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}
