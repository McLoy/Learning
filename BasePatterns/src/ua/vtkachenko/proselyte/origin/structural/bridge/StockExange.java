package ua.vtkachenko.proselyte.origin.structural.bridge;

public class StockExange extends Program {

    protected StockExange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange development in progress....");
        developer.writeCode();
    }
}
