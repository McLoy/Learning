package ua.vtkachenko.proselyte.check.creational.factory;

public class Program {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialization("php");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialization(String specialization){
        if (specialization.equals("java")){
            return new JavaDeveloperFactory();
        } else if (specialization.equals("c++")){
            return new JavaDeveloperFactory();
        } else {
            throw new RuntimeException(specialization + " developer not fou nd!");
        }
    }

}
