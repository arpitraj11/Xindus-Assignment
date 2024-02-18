package com.example.Wishlist.Management;

import com.example.Wishlist.Management.model.Product;
import com.example.Wishlist.Management.model.User;
import com.example.Wishlist.Management.repository.IUserRepo;
import com.example.Wishlist.Management.repository.IWishlistRepo;
import com.example.Wishlist.Management.service.UserService;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    @InjectMocks
    private UserService userService;

    @Mock
    private IUserRepo userRepository;

    @Mock
    private IWishlistRepo wishlistRepo;

    public UserServiceTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddUser() {
        User user = new User();
        user.setUsername("testUser");
        user.setEmail("test@example.com");
        user.setPassword("testPassword");

        when(userRepository.save(user)).thenReturn(user);

        String result = userService.addUser(user);

        assertEquals("user added", result);
    }

    @Test
    public void testGetUserWishList_ValidCredentials() {
        User user = new User();
        user.setEmail("test@example.com");
        user.setPassword("testPassword");

        List<Product> expectedWishlist = new ArrayList<>();
        when(userRepository.findByEmail("test@example.com")).thenReturn(user);
        when(wishlistRepo.findByUser(user)).thenReturn(expectedWishlist);

        List<Product> result = userService.getUserWishList("test@example.com", "testPassword");

        assertEquals(expectedWishlist, result);
    }

    @Test
    public void testGetUserWishList_InvalidCredentials() {
        User user = new User();
        user.setEmail("test@example.com");
        user.setPassword("testPassword");

        when(userRepository.findByEmail("test@example.com")).thenReturn(user);

        List<Product> result = userService.getUserWishList("test@example.com", "wrongPassword");

        assertNull(result);
    }
}
