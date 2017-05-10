package ua.vtkachenko.testCore_04_05_2017.question2;

public class Main {
    public static void main(String[] args) {
        int n = 33;
        int s = 0;
        while (n > 0) {
            System.out.println(n + " " + s);
            s += n % 2;
            n /= 2;
        }
        System.out.println(s);
        System.out.println(1%2);
    }

}
