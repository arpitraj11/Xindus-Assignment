package com.example.Wishlist.Management.service;

import com.example.Wishlist.Management.model.Product;
import com.example.Wishlist.Management.model.User;
import com.example.Wishlist.Management.repository.IUserRepo;
import com.example.Wishlist.Management.repository.IWishlistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private IUserRepo userRepository;

    @Autowired
    private IWishlistRepo wishlistRepo;


    public String addUser(User user) {
        userRepository.save(user);
        return "user added";
    }

    public List<Product> getUserWishList(String useremail, String userpassword) {

        User user=userRepository.findByEmail(useremail);
        if(!user.getPassword().equals(userpassword)){
            return null;
        }else{
            return wishlistRepo.findByUser(user);
        }
    }


}
