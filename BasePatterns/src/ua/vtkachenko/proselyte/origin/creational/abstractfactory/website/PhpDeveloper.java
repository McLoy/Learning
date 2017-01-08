package ua.vtkachenko.proselyte.origin.creational.abstractfactory.website;

import ua.vtkachenko.proselyte.origin.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer{
    @Override
    public void writeCode() {
        System.out.println("Php developer write code....");
    }
}
