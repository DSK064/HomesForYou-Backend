package com.BackendSecurity.controllers;



import com.BackendSecurity.models.Home;
import com.BackendSecurity.security.services.HomeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/home")
public class HomeController {

    @Autowired
    private final HomeService homeService;

    public HomeController(HomeService homeService){this.homeService= homeService;}


    @PostMapping
    public ResponseEntity<Home> saveHome(@RequestBody Home home)
    {
        return new ResponseEntity<Home>(homeService.saveHome(home), HttpStatus.CREATED);

    }

    @GetMapping
    public List<Home> getAllHomes()
    {
        return homeService.getAllHomes();
    }
    @GetMapping("{id}")
    public ResponseEntity<Home> getHomeById(@PathVariable("id") int id)
    {
        return new ResponseEntity<Home>(homeService.getHomeById(id),HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Home> updateHome(@PathVariable("id")int id, @RequestBody Home home)
    {
        return new ResponseEntity<Home>(homeService.updateHome(home,id), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteJob(@PathVariable("id")int id)
    {
        homeService.deleteHome(id);
        return new ResponseEntity<String>("home deleted successfully",HttpStatus.OK);
    }
}
