package ua.vtkachenko.proselyte.check.creational.singleton;

public class Logger {
    private static Logger logger;
    private static String log = "Start logging...\n";

    private Logger() {
    }

    public static synchronized Logger init(){
        if (logger != null){
            logger = new Logger();
        }
        return logger;
    }

    public static void add(String message) {
        log += "\n" + message;
    }

    public static void showLog(){
        System.out.println(log);
    }
}
