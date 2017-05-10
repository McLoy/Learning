package ua.vtkachenko.testCore_10_05_2017.question7;

public class Test {
    static Boolean bo1 = new Boolean("true");
    static Boolean bo2 = new Boolean(false);

    public static void main(String[] args) {
        Boolean bo3 = new Boolean(bo1);
        Boolean bo4 = new Boolean("bo2");
        System.out.println(bo1.equals(bo3));
        System.out.println(bo2.equals(bo4));
    }
} 