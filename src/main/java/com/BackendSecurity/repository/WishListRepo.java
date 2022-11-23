package com.BackendSecurity.repository;

import com.BackendSecurity.models.WishList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WishListRepo extends JpaRepository<WishList,Integer>{

    List<WishList> findAllByUserId(int userId);
    Optional<WishList> findByUserIdAndHomeId(int userId, int homeId);
}
