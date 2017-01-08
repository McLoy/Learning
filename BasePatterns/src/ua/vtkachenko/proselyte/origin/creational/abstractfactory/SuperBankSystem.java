package ua.vtkachenko.proselyte.origin.creational.abstractfactory;

import ua.vtkachenko.proselyte.origin.creational.abstractfactory.banking.BankTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.gerTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank project...");
        developer.writeCode();
        tester.testsCode();
        projectManager.manageProject();
    }
}
