package com.BackendSecurity.security.services;

import com.BackendSecurity.models.Home;
import com.BackendSecurity.models.WishList;

import java.util.List;

public interface WishListService {
    WishList saveHome(WishList wishList);
    List<WishList> getAllHomesByUserId(int userId);
    void deleteHome(int wishListId);


}
