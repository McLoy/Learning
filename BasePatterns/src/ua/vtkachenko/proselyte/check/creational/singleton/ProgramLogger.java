package ua.vtkachenko.proselyte.check.creational.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logFile = "This is log file \n\n";

    public static synchronized ProgramLogger init(){
        if (programLogger == null){
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    private ProgramLogger(){}

    public void addLog(String str){
        logFile += str + "\n";
    }

    public void showlog(){
        System.out.println(logFile);
    }
}
