package ua.vtkachenko.testCore_10_05_2017.question5;

public class Main {
    public static void main(String[] args) {
        Integer i = new Integer("10");
        if (i.toString() == i.toString()) {
            System.out.println("Равный");
        } else {
            System.out.println("Неравный");
        }
    }
}
