package ua.vtkachenko.proselyte.origin.structural.proxy;

public class RealProject implements Project {

    private String url;

    public void load(){
        System.out.println("loading project from " + url + "....");
    }

    public RealProject(String url) {
        this.url = url;
        load();
    }

    @Override
    public void run() {
        System.out.println("Running project" + url + "...");
    }
}
