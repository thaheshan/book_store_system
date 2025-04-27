/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.book_application_store_system.Exceptions;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(int orderId) {
        super("Order with ID " + orderId + " not found.");
    }
}
