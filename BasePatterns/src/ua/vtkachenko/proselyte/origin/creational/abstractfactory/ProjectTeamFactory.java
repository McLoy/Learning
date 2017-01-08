package ua.vtkachenko.proselyte.origin.creational.abstractfactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester gerTester();
    ProjectManager getProjectManager();
}
