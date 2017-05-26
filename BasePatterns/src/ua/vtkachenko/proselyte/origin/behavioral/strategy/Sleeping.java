package ua.vtkachenko.proselyte.origin.behavioral.strategy;

public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping");
    }
}
