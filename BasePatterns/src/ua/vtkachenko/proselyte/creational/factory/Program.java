package ua.vtkachenko.proselyte.creational.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("php");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpeciality(String speciality){
        if (speciality.equals("java")){
            return new JavaDeveloperFactory();
        } else if (speciality.equals("c++")) {
            return new CppDeveloperFactory();
        } else if (speciality.equals("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " is unknown speciality.");
        }
    }
}
