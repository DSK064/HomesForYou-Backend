package com.BackendSecurity.security.services;

import com.BackendSecurity.models.Home;
import com.BackendSecurity.repository.HomeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeServiceImp implements HomeService {

    @Autowired
    private final HomeRepo homeRepo;
    
    public HomeServiceImp(HomeRepo homeRepo){this.homeRepo=homeRepo;}

    @Override
    public Home saveHome(Home home){return homeRepo.save(home);};

    @Override
    public List<Home> getAllHomes(){return homeRepo.findAll();}

    @Override
    public Home getHomeById(int id ){return homeRepo.findById(id).orElseThrow();}

    @Override
    public Home updateHome(Home home , int id )
    {
        Home existingHome = homeRepo.findById(id).orElseThrow();
        existingHome.setHomeName(home.getHomeName());
        existingHome.setType(home.getType());
        existingHome.setHomePrice(home.getHomePrice());
        existingHome.setLocation(home.getLocation());

        homeRepo.save(existingHome);
        return existingHome;
    }

    @Override
    public void deleteHome(int id){
        homeRepo.findById(id).orElseThrow();
        homeRepo.deleteById(id);
    }
}
