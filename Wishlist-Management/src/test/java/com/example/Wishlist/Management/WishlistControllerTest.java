package com.example.Wishlist.Management;

import com.example.Wishlist.Management.controller.WishlistController;
import com.example.Wishlist.Management.model.Product;
import com.example.Wishlist.Management.model.User;
import com.example.Wishlist.Management.service.UserService;
import com.example.Wishlist.Management.service.WishlistService;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class WishlistControllerTest {

    @InjectMocks
    private WishlistController wishlistController;

    @Mock
    private WishlistService wishlistService;

    @Mock
    private UserService userService;

    public WishlistControllerTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddProduct() {
        Product product = new Product();
        product.setName("Test Product");

        when(wishlistService.addProduct(product)).thenReturn("Product Added");

        String result = wishlistController.addProduct(product);

        assertEquals("Product Added", result);
    }

    @Test
    public void testGetUserWishlist() {
        User user = new User();
        user.setEmail("test@example.com");
        user.setPassword("testPassword");

        List<Product> expectedWishlist = new ArrayList<>();
        when(userService.getUserWishList("test@example.com", "testPassword")).thenReturn(expectedWishlist);

        List<Product> result = wishlistController.getUserWishlist("test@example.com", "testPassword");

        assertEquals(expectedWishlist, result);
    }

    @Test
    public void testDeleteWishList() {
        Long id = 1L;

        when(wishlistService.deleteWishlist(id)).thenReturn("wishlist deleted");

        String result = wishlistController.deleteWishList(id);

        assertEquals("wishlist deleted", result);
    }
}
