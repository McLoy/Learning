package ua.vtkachenko.prospring4.ch3;

/**
 * @author Vladyslav T
 * @version 1.0
 */
public class Singleton {
    private static Singleton instance;
    static {
        instance = new Singleton();
    }
    public static Singleton getInstance(){
        return instance;
    }
}
