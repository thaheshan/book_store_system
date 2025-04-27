package com.bookstore.book_application_store_system.Models;

import com.liferay.headless.commerce.delivery.cart.dto.v1_0.CartItem;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a customer's cart containing cart items.
 * 
 * @author Thahe
 */
public class Cart {

    private int customerId;
    private List<CartItem> items;
    
    // Default constructor
    public Cart() {
        items = new ArrayList<>();
    }
    
    // Parameterized constructor
    public Cart(int customerId) {
        this.customerId = customerId;
        this.items = new ArrayList<>();
    }
    
    // Getters and setters
    public int getCustomerId() {
        return customerId;
    }
    
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    
    public List<CartItem> getItems() {
        return items;
    }
    
    public void setItems(List<CartItem> items) {
        this.items = items;
    }
    
    // Add an item to the cart
    public void addItem(CartItem item) {
        // Check if the item already exists in the cart
        for (CartItem existingItem : items) {
            if (existingItem.getBookId() == item.getBookId()) {
                // Update the quantity
                existingItem.setQuantity(existingItem.getQuantity() + item.getQuantity());
                return;
            }
        }
        
        // If the item doesn't exist, add it
        items.add(item);
    }
    
    // Remove an item from the cart
    public boolean removeItem(int bookId) {
        return items.removeIf(item -> item.getBookId() == bookId);
    }
    
    // Update the quantity of an item
    public boolean updateItemQuantity(int bookId, int quantity) {
        for (CartItem item : items) {
            if (item.getBookId() == bookId) {
                item.setQuantity(quantity);
                return true;
            }
        }
        return false;
    }
    
    // Clear the cart
    public void clear() {
        items.clear();
    }
}
