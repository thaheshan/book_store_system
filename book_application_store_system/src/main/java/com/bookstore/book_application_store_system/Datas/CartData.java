/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.book_application_store_system.Datas;

import com.bookstore.book_application_store_system.Models.Cart;
import com.liferay.headless.commerce.delivery.cart.dto.v1_0.CartItem;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Thahe
 */
public class CartData {

      private static Map<Integer, Cart> carts = new HashMap<>();
    
    static {
        // Initialize with sample data
        addSampleCarts();
    }
    
    private static void addSampleCarts() {
        // Create a cart for customer 1 with some items
        Cart cart1 = new Cart(1);
        cart1.addItem(new CartItem(1, 2)); // 2 copies of book 1
        cart1.addItem(new CartItem(2, 1)); // 1 copy of book 2
        carts.put(1, cart1);
        
        // Create an empty cart for customer 2
        Cart cart2 = new Cart(2);
        carts.put(2, cart2);
    }
    
    // Get cart by customer ID
    public Cart getCartByCustomerId(int customerId) {
        return carts.computeIfAbsent(customerId, k -> new Cart(customerId));
    }
    
    // Create or update cart
    public Cart saveCart(Cart cart) {
        carts.put(cart.getCustomerId(), cart);
        return cart;
    }
    
    // Delete cart
    public boolean deleteCart(int customerId) {
        return carts.remove(customerId) != null;
    }
    
    // Check if cart exists
    public boolean cartExists(int customerId) {
        return carts.containsKey(customerId);
    }
}
