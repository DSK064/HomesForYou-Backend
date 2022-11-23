package com.BackendSecurity.controllers;

import com.BackendSecurity.models.Home;
import com.BackendSecurity.models.User;
import com.BackendSecurity.security.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UsersService usersService;

    @GetMapping
    public List<User> getAllHomes()
    {
        return usersService.getAllUsers();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteJob(@PathVariable("id")Long id)
    {
        usersService.deleteUser(id);
        return new ResponseEntity<String>("home deleted successfully", HttpStatus.OK);
    }
}
