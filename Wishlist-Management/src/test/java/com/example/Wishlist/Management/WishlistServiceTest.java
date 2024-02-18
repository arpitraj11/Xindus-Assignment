package com.example.Wishlist.Management;

import com.example.Wishlist.Management.model.Product;
import com.example.Wishlist.Management.repository.IWishlistRepo;
import com.example.Wishlist.Management.service.WishlistService;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

public class WishlistServiceTest {
    @InjectMocks
    private WishlistService wishlistService;

    @Mock
    private IWishlistRepo wishlistRepo;

    public WishlistServiceTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAddProduct() {
        Product product = new Product();
        product.setName("Test Product");

        String result = wishlistService.addProduct(product);

        assertEquals("Product Added", result);
    }

    @Test
    public void testDeleteWishlist() {
        Long id = 1L;

        String result = wishlistService.deleteWishlist(id);

        assertEquals("wishlist deleted", result);
    }
}
