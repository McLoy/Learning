package ua.vtkachenko.proselyte.origin.creational.abstractfactory.banking;

import ua.vtkachenko.proselyte.origin.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Java developer write code...");
    }
}
