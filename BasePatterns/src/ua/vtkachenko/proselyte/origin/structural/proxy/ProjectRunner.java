package ua.vtkachenko.proselyte.origin.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("http://ww.github.com/mcloy/realproject");

        project.run();
    }
}
