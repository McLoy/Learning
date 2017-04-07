package ua.vtkachenko;

public class Ran {
    private int max;
    private int last;

    public Ran(int max){
        this.max = max;
        last = (int) (System.currentTimeMillis() % max);
    }

    public int nextInt(){
        last = (last * 32719 + 3) % 32749;
        return last % max;
    }
}
