package ua.vtkachenko.prospring4.ch3.annotation;

import org.springframework.stereotype.Component;

/**
 * @author Vladyslav T
 * @version 1.0
 */
@Component("injectSimpleConfig")
public class InjectSimpleConfig {
    public String name = "John Smith";
    public int age = 35;
    public float height = 180;
    public boolean programmer = true;
    public Long ageInSeconds = 1103760000L;
}
