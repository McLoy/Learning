package ua.vtkachenko.testCore_10_05_2017.question8;

public class Test {
    static void m(int ... a) {
        System.out.println("1");
    }

    static void m(Integer ... a) {
        System.out.println("2");
    }

    public static void main(String[] args) {
//        m(1, 2);
    }
}