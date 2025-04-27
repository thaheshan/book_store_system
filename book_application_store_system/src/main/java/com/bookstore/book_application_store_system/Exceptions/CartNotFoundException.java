/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.book_application_store_system.Exceptions;


public class CartNotFoundException extends RuntimeException {
    public CartNotFoundException(int customerId) {
        super("Cart for customer ID " + customerId + " not found.");
    }
}
