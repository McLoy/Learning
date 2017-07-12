package ua.vtkachenko.prospring4.ch3;

/**
 * @author Vladyslav T
 * @version 1.0
 */
public class ReplacementTarget {
    public String formatMessage(String msg){
        return "<h1>" + msg + "</h1>";
    }
    public String formatMessage(Object msg){
        return "<h1>" + msg + "</h1>";
    }
}
