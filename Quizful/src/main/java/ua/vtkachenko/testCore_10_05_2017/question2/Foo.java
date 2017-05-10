package ua.vtkachenko.testCore_10_05_2017.question2;

public class Foo {
//    private Foo() {
//        return this;            // 1
//    }
    public static Foo get() {
        return new Foo();       // 2
    }

    public static String getIt() {
        return "get";       // 2
    }

    public static void main(String[] args) {
//        Foo foo1 = get();       // 3
//        Foo foo2 = new Foo();   // 4
        System.out.println(getIt());
        System.out.println(Foo.getIt());
        System.out.println(new Foo().getIt());
    }
}