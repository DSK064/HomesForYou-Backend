package com.BackendSecurity.security.services;

import com.BackendSecurity.models.Home;
import com.BackendSecurity.models.User;

import java.util.List;

public interface UsersService {
    List<User> getAllUsers();
    void deleteUser(Long id );
}
