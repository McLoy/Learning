package ua.vtkachenko.springsecapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.vtkachenko.springsecapp.model.User;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
