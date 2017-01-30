package ua.vtkachenko.proselyte.origin.structural.bridge;

public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {
//                new BankSystem(new JavaDeveloper()),
//                new StockExange(new CppDeveloper())
                new BankSystem(new CppDeveloper()),
                new StockExange(new JavaDeveloper())
        };

        for (Program program : programs){
            program.developProgram();
        }
    }
}
