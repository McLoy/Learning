package ua.vtkachenko.proselyte.origin.creational.factory;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ developer write C++ code");
    }
}