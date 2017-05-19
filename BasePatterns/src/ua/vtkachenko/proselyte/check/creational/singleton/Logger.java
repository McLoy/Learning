package ua.vtkachenko.proselyte.check.creational.singleton;

public class Logger {
    private static Logger logger;
    private static String text = "Start of logging...\n";

    public static synchronized Logger init(){
        if (logger == null){
            logger = new Logger();
        }
        return logger;
    }

    private Logger(){}

    public static void add(String message){
        text += "\n" + message;
    }

    public static void show(){
        System.out.println(text);
    }

}
