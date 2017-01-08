package ua.vtkachenko.proselyte.origin.creational.abstractfactory.banking;

import ua.vtkachenko.proselyte.origin.creational.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager{
    @Override
    public void manageProject() {
        System.out.println("PM manages project");
    }
}
