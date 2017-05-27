package ua.vtkachenko.springsecapp.service;

import ua.vtkachenko.springsecapp.model.User;

/**
 * Service class for {@link ua.vtkachenko.springsecapp.model.User}
 *
 * @author Vladyslav T
 * @version 1.0
 */
public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
