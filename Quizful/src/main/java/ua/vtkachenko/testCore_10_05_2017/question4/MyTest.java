package ua.vtkachenko.testCore_10_05_2017.question4;

public class MyTest {
    public static void main(String[] args) {
        label1: for (int i = 0; i < 3; i++) {
            if (i == 1)
                continue label1;
            label2:
            System.out.print("TEST ");
            label3:;
        }
    }
}