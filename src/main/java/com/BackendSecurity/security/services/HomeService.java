package com.BackendSecurity.security.services;



import com.BackendSecurity.models.Home;

import java.util.List;

public interface HomeService {

    Home saveHome(Home job);

    List<Home> getAllHomes();

    Home getHomeById(int id);

    Home updateHome(Home job, int id);

    void deleteHome(int id );
}
