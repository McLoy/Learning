package ua.vtkachenko.proselyte.check.creational.singleton;

public class Program {
    public static void main(String[] args) {
        ProgramLogger.init().addLog("First log...");
        ProgramLogger.init().addLog("Second log...");
        ProgramLogger.init().addLog("Third log...");

        ProgramLogger.init().showlog();
    }
}
