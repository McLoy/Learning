package ua.vtkachenko.Concurrency.way1;

public class Prog {			//Класс с методом main()
//    static SomeThing mThing;	//mThing - объект класса, реализующего интерфейс Runnable
//
    public static void main(String[] args){
//        mThing = new SomeThing();
//
//        Thread myThready = new Thread(mThing);	//Создание потока "myThready"
//        myThready.start();				//Запуск потока
//
//        System.out.println("Главный поток завершён...");
//    }

    Thread myThready = new Thread(new Runnable(){
        public void run() {
            System.out.println("Привет из побочного потока!");
        }
    });
    myThready.start();	//Запуск потока

    System.out.println("Главный поток завершён...");
    }
}