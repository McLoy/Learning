package ua.vtkachenko;

public class Ran {
    private int last;
    public int nextInt(){
        last = (int) (System.nanoTime()) + 813;
        last = (last - (last/1000)*1000);
        if (last < 0){
            last *= -1;
        }
        return last;
    }
}
