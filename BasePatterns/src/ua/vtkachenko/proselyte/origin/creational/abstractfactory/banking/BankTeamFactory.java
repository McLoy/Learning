package ua.vtkachenko.proselyte.origin.creational.abstractfactory.banking;

import ua.vtkachenko.proselyte.origin.creational.abstractfactory.Developer;
import ua.vtkachenko.proselyte.origin.creational.abstractfactory.ProjectManager;
import ua.vtkachenko.proselyte.origin.creational.abstractfactory.ProjectTeamFactory;
import ua.vtkachenko.proselyte.origin.creational.abstractfactory.Tester;

public class BankTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester gerTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
