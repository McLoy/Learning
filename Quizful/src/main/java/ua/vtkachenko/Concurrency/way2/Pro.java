package ua.vtkachenko.Concurrency.way2;

public class Pro {

    static AffableThread mSecondThread;

    public static void main(String[] args)
    {
        mSecondThread = new AffableThread();	//Создание потока
        mSecondThread.start();					//Запуск потока

        System.out.println("Главный поток завершён...");
    }

}
