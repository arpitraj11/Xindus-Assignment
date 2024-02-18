package com.example.Wishlist.Management.controller;

import com.example.Wishlist.Management.model.Product;
import com.example.Wishlist.Management.model.User;
import com.example.Wishlist.Management.service.UserService;
import com.example.Wishlist.Management.service.WishlistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WishlistController {

    @Autowired
    WishlistService wishlistService;

    @Autowired
    UserService userService;

    // /api/wishlists: POST endpoint to create a new wishlist item.
    @PostMapping("wishlists")
    public String addProduct(@RequestBody Product product){
        return wishlistService.addProduct(product);
    }


    //api/wishlists: GET endpoint to retrieve a user's wishlist.
    @GetMapping("wishlists")
    public List<Product> getUserWishlist(@RequestParam String useremail ,@RequestParam String userpassword){
        return userService.getUserWishList(useremail,userpassword);
    }


    // /api/wishlists/{id}: DELETE endpoint to remove a wishlist item by ID.
    @DeleteMapping("wishlist/{id}")
    public String deleteWishList(@PathVariable Long id){
        return wishlistService.deleteWishlist(id);
    }
    @PostMapping("user")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }




}
