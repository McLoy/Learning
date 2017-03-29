package ua.vtkachenko.proselyte.origin.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addVacancy("First java position");
        jobSite.addVacancy("Second java position");

        Observer firstSubscriber = new Subscriber("Eugene");
        Observer secondSubscriber = new Subscriber("Piter");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third java position");

        jobSite.removeVacancy("First java position");
    }
}
