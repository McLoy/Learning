package ua.vtkachenko.proselyte.check.creational.prototype;

public class AutoFactory implements Cloneble {
    Car car;

    public AutoFactory(Car car) {
        this.car = car;
    }

    @Override
    public Car getClone() {
        return (Car) car.copy();
    }
}
