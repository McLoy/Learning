package ua.vtkachenko.proselyte.check.creational.prototype;

public class PhoneFactory {
    private Phone phone;

    public PhoneFactory(Phone phone) {
        this.phone = phone;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Phone clonePhone(){
        return (Phone) phone.copy();
    }
}
