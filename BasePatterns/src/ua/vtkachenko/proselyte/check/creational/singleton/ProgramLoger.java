package ua.vtkachenko.proselyte.check.creational.singleton;

public class ProgramLoger {
    private static ProgramLoger programLoger;
    private static String text = "Log of file...\n\n";
    private ProgramLoger(){}

    public static synchronized ProgramLoger init(){
        if (programLoger == null){
            programLoger = new ProgramLoger();
        }
        return programLoger;
    }

    public void add(String message){
        text += message + "\n";
    }

    public String showLog(){
        return text;
    }
}
