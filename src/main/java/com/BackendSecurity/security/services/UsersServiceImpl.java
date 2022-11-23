package com.BackendSecurity.security.services;

import com.BackendSecurity.models.User;
import com.BackendSecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersServiceImpl implements UsersService{
    @Autowired
    private UserRepository userRepository;

    public UsersServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id){
        userRepository.findById(id).orElseThrow();
        userRepository.deleteById(id);
    }
}
