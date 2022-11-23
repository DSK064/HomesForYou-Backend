package com.BackendSecurity.repository;
import com.BackendSecurity.models.Home;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeRepo extends JpaRepository<Home,Integer> {
}
