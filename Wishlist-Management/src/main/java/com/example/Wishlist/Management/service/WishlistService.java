package com.example.Wishlist.Management.service;

import com.example.Wishlist.Management.model.Product;
import com.example.Wishlist.Management.repository.IUserRepo;
import com.example.Wishlist.Management.repository.IWishlistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishlistService {

    @Autowired
    IWishlistRepo wishlistRepo;

    @Autowired
    IUserRepo userRepo;


    public String addProduct(Product product) {
        wishlistRepo.save(product);
        return "Product Added";
    }

    public String deleteWishlist(Long id) {
        wishlistRepo.deleteById(id);
        return "wishlist deleted";
    }
}
