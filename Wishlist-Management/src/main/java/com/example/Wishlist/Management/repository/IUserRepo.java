package com.example.Wishlist.Management.repository;

import com.example.Wishlist.Management.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User, Long> {

    User findByEmail(String useremail);
}
