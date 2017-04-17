package xyz.kots.springsecurity.dao;

import xyz.kots.springsecurity.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
