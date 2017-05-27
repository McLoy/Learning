package ua.vtkachenko.proselyte.check.creational.singleton;

public class Start {
    public static void main(String[] args) {
        Logger.init();
        Logger.add("First comment");
        Logger.add("Second comment");
        Logger.showLog();
    }
}
