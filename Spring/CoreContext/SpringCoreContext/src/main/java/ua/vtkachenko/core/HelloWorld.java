package ua.vtkachenko.core;

/**
 * Simple spring bean
 *
 * @author Vladyslav T
 * @version 1.0
 */

public class HelloWorld {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println("Spring 3: Hello! " + name);
    }
}
