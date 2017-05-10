package ua.vtkachenko.testCore_10_05_2017.question3;

public class Bar {
    public static void main(String args[]) {
        label:
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                if (i > 2) break label;
                System.out.print(j);
            }
            System.out.print(" ");
        }
    }
}