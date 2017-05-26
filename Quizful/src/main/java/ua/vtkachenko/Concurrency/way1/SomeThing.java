package ua.vtkachenko.Concurrency.way1;

public class SomeThing	implements Runnable{		//(содержащее метод run())
    public void run(){
        System.out.println("Привет из побочного потока!");
    }
}


