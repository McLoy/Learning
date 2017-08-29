package ua.vtkachenko.prospring4.ch4;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @author Vladyslav T
 * @version 1.0
 */
public class BeanNamePrinter implements BeanNameAware {
    private String beanName;

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public void someOperation()
    {
        System.out.println("Bean [" + beanName + "] - someOperation()");
    }
}
