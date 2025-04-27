package com.bookstore.book_application_store_system.Models;

import com.liferay.headless.commerce.delivery.cart.dto.v1_0.CartItem;

import java.util.List;

/**
 * Represents an Order with customer and cart item details.
 *
 * Author: Thahe
 */
public class Order {

    private int orderID;
    private String customerID; // should be String like "CUST1"
    private List<CartItem> items; // List of cart items
    private double totalAmount;

    // Default constructor
    public Order() {
    }

    // Parameterized constructor
    public Order(int orderID, String customerID, List<CartItem> items, double totalAmount) {
        this.orderID = orderID;
        this.customerID = customerID;
        this.items = items;
        this.totalAmount = totalAmount;
    }

    public Order(int i, int customerId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getters and Setters
    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
