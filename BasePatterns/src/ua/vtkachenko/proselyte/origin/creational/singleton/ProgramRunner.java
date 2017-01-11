package ua.vtkachenko.proselyte.origin.creational.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("First log..");
        ProgramLogger.getProgramLogger().addLogInfo("2 log..");
        ProgramLogger.getProgramLogger().addLogInfo("3 log..");

        ProgramLogger.getProgramLogger().showLogFile();

    }
}
