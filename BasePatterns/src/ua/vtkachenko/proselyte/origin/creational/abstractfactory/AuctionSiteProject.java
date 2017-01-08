package ua.vtkachenko.proselyte.origin.creational.abstractfactory;

import ua.vtkachenko.proselyte.origin.creational.abstractfactory.website.WebSiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.gerTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating web project...");
        developer.writeCode();
        tester.testsCode();
        projectManager.manageProject();
    }
}
