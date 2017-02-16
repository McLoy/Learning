package ua.vtkachenko.proselyte.origin.structural.facade;

import ua.vtkachenko.proselyte.origin.decorator.*;

public class WorkFlowFacade {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveProblems(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
