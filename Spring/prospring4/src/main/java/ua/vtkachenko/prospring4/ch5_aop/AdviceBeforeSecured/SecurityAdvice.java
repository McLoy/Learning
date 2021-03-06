package ua.vtkachenko.prospring4.ch5_aop.AdviceBeforeSecured;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class SecurityAdvice implements MethodBeforeAdvice {
    private SecurityManager securityManager;

    public SecurityAdvice(){
        this.securityManager = new SecurityManager();
    }

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        UserInfo user = securityManager.getLoggedOnUesr();
        if (user == null){
            System.out.println("No user authenticated");
            throw new SecurityException("You must login before attempting to invoke the method: "
            + method.getName());
        } else if ("chris".equals(user.getUserName())){
            System.out.println("Logged in user is chris - OKAY!");
        } else {
            System.out.println("Logged in user is " + user.getUserName()
            + " NOT GOOD :(");
            throw new SecurityException("User " + user.getUserName()
            + " is not allowed access to method " + method.getName());
        }
    }
}
