package ua.vtkachenko.proselyte.check.creational.prototype;

public class Phone implements ClonablePhone{
    private String name;

    public Phone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public Object copy() {
        return new Phone(name);
    }
}
