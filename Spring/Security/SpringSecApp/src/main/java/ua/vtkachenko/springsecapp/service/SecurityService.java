package ua.vtkachenko.springsecapp.service;

/**
 * Service for Security
 *
 * @author Vladyslav T
 * @version 1.0
 */
public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}