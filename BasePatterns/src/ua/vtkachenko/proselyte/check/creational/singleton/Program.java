package ua.vtkachenko.proselyte.check.creational.singleton;

public class Program {
    public static void main(String[] args) {

        ProgramLoger.init().add("First log..");
        ProgramLoger.init().add("Second log..");
        ProgramLoger.init().add("Third log..");

        System.out.println(ProgramLoger.init().showLog());
    }
}
