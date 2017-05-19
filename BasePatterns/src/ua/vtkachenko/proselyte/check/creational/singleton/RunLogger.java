package ua.vtkachenko.proselyte.check.creational.singleton;

public class RunLogger {
    public static void main(String[] args) {
        Logger.init().add("Hi there");
        Logger.init().add("Second row");
        Logger.init().add("Third row");
        Logger.show();
    }
}
