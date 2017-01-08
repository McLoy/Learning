package ua.vtkachenko.proselyte.origin.creational.abstractfactory.website;

import ua.vtkachenko.proselyte.origin.creational.abstractfactory.Developer;
import ua.vtkachenko.proselyte.origin.creational.abstractfactory.ProjectManager;
import ua.vtkachenko.proselyte.origin.creational.abstractfactory.ProjectTeamFactory;
import ua.vtkachenko.proselyte.origin.creational.abstractfactory.Tester;

public class WebSiteTeamFactory implements ProjectTeamFactory{
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester gerTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebSitePM();
    }
}
