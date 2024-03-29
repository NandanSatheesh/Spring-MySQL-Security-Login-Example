package com.gpch.login.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.gpch.login.model.Role;

@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role,Integer> {

    Role findByRole(String role);
}
