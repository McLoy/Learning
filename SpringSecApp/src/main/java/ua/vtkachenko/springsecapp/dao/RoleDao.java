package ua.vtkachenko.springsecapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.vtkachenko.springsecapp.model.Role;

public interface RoleDao extends JpaRepository<Role, Long> {
}
