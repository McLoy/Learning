package ua.vtkachenko.prospring4.ch3;

/**
 * @author Vladyslav T
 * @version 1.0
 */
public abstract class AbstractLookupDemoBean implements DemoBean {
    public abstract MyHelper getMyHelper();

    @Override
    public void someOperation() {
        getMyHelper().doSomethingHelpful();
    }
}
