package ua.vtkachenko.proselyte.check.creational.prototype;

public class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public Object copy(){
        return new Car(name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
