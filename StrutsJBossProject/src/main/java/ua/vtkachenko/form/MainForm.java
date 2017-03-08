package ua.vtkachenko.form;

import org.apache.struts.action.ActionForm;

public class MainForm extends ActionForm {

    String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}
