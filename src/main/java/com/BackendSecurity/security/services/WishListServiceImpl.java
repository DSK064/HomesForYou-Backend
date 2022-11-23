package com.BackendSecurity.security.services;

import com.BackendSecurity.models.Home;
import com.BackendSecurity.models.WishList;
import com.BackendSecurity.repository.WishListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WishListServiceImpl implements WishListService{

    @Autowired
    private WishListRepo wishListRepo;


    @Override
    public WishList saveHome(WishList wishList) {
        Optional<WishList> userIdAndHomeID = wishListRepo.findByUserIdAndHomeId(wishList.getUserId(), wishList.getHomeId());
        if (userIdAndHomeID.isPresent()) {
            throw new IllegalStateException("Home is already added");
        }
        return wishListRepo.save(wishList);
    }
    @Override
    public List<WishList> getAllHomesByUserId(int userId) {
        return wishListRepo.findAllByUserId(userId);
    }

    @Override
    public void deleteHome(int wishListId) {
        wishListRepo.findById(wishListId).orElseThrow();
        wishListRepo.deleteById(wishListId);
    }
}
