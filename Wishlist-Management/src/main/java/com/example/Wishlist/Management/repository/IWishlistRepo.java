package com.example.Wishlist.Management.repository;

import com.example.Wishlist.Management.model.Product;
import com.example.Wishlist.Management.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IWishlistRepo extends JpaRepository<Product, Long> {

    List<Product> findByUser(User user);
}
