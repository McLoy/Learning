package ua.vtkachenko.action;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import ua.vtkachenko.form.MainForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainAction extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception{
        MainForm mainForm = (MainForm) form;
        mainForm.setGreeting("Hello with greeting");

        return mapping.findForward("success");
    }
}
