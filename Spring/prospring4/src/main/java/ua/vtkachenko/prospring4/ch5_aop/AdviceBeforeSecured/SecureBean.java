package ua.vtkachenko.prospring4.ch5_aop.AdviceBeforeSecured;

public class SecureBean {
    public void writeSecureMessage(){
        System.out.println("Every time I learn something new, "
        + "it pushes some old stuff out of my brain");
    }
}
