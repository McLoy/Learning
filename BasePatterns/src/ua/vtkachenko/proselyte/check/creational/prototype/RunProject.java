package ua.vtkachenko.proselyte.check.creational.prototype;

public class RunProject {
    public static void main(String[] args) {
        Car bmw = new Car("BMW");
        System.out.println(bmw);

        System.out.println("=================");
        AutoFactory factory = new AutoFactory(bmw);
        Car newBMW = factory.getClone();
        System.out.println(newBMW);
    }
}
