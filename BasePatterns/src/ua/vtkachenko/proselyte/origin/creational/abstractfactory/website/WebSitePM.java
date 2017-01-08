package ua.vtkachenko.proselyte.origin.creational.abstractfactory.website;

import ua.vtkachenko.proselyte.origin.creational.abstractfactory.ProjectManager;

public class WebSitePM implements ProjectManager{
    @Override
    public void manageProject() {
        System.out.println("Project manager manage web project");
    }
}
