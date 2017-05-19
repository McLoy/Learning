package ua.vtkachenko.proselyte.check.creational.prototype;

public class StartPhoneFactory {
    public static void main(String[] args) {
        Phone samsung = new Phone("Samsung");
        System.out.println(samsung.toString());

        PhoneFactory phoneFactory = new PhoneFactory(samsung);
        Phone newSamsung = phoneFactory.clonePhone();

        System.out.println("=======");
        System.out.println(newSamsung.toString());
    }
}
