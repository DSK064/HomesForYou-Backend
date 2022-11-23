package com.BackendSecurity.controllers;

import com.BackendSecurity.models.WishList;
import com.BackendSecurity.security.services.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/wishlist")
public class WishListController {
    @Autowired
    WishListService wishListService;
    public WishListController(WishListService wishListService) {
        this.wishListService = wishListService;
    }

    @PostMapping("/addhome")
    public ResponseEntity<WishList> saveHome(@RequestBody WishList wishList)
    {
        return new ResponseEntity<WishList>(wishListService.saveHome(wishList),HttpStatus.CREATED);
    }

    @GetMapping("{userId}")
    public List<WishList> getAllHomesByUserId(@PathVariable("userId") int userId)
    {
        return wishListService.getAllHomesByUserId(userId);
    }
    @DeleteMapping("{wishListId}")
    public ResponseEntity<String> deleteJob(@PathVariable("wishListId")int wishListId)
    {
        wishListService.deleteHome(wishListId);
        return new ResponseEntity<String>("home deleted successfully",HttpStatus.OK);
    }

}
