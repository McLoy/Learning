package ua.vtkachenko.prospring4.ch4.AnnotationJSR330;

public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
