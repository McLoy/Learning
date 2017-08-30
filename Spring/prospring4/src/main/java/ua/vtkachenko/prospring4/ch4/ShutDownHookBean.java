package ua.vtkachenko.prospring4.ch4;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author Vladyslav T
 * @version 1.0
 */
public class ShutDownHookBean implements ApplicationContextAware {
    private ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
            if (ctx instanceof GenericApplicationContext)
            {
                ((GenericXmlApplicationContext) ctx).registerShutdownHook();
            }
    }
}
