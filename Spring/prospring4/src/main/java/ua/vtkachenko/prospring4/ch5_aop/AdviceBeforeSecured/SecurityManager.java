package ua.vtkachenko.prospring4.ch5_aop.AdviceBeforeSecured;

public class SecurityManager {
    private static ThreadLocal<UserInfo> threadLocal = new ThreadLocal<>();

    public void login(String userName, String password){
        threadLocal.set(new UserInfo(userName, password));
    }

    public void logout(){
        threadLocal.set(null);
    }

    public UserInfo getLoggedOnUesr(){
        return threadLocal.get();
    }
}
