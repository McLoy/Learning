package ua.vtkachenko;

import java.util.Random;

public class DataWrapper implements Wrapper{

    private int size;
    private int capacity;
    private int[] array;

    public DataWrapper(int[] data, int N){
        this.capacity = N;
        this.array = randomInitialization();
        this.size = data.length;
        for (int i = 0; i < data.length; i++) {
            this.array[i] = data[i];
        }
    }

    public int read(int index) {
        if (index < size){
            return array[index];
        } else {
            return 0;
        }
    }

    public void write(int index, int value) {
        if (index < capacity){
            array[index] = value;
        }
    }

    public int size(){
        return capacity;
    }

    private int[] randomInitialization(){
        array = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            array[i] = new Random(10).nextInt();
        }
        return this.array;
    }

    public static void main(String[] args) {
        int N = 15;
        int K = new Random().nextInt(10);
        int[] arrK = new int[K];
        for (int i = 0; i < arrK.length; i++) {
            arrK[i] = new Random().nextInt(10);
        }
        DataWrapper dw = new DataWrapper(arrK, N);
        for (int i = 0; i < dw.size(); i++) {
            System.out.println(dw.read(i));
        }
    }
}
