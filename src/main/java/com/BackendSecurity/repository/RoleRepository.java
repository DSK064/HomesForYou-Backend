package com.BackendSecurity.repository;

import java.util.Optional;

import com.BackendSecurity.models.ERole;
import com.BackendSecurity.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
