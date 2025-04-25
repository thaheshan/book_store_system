/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.book_store_application.Models;

import java.util.Map;

/**
 *
 * @author Thahe
 */
public class Cart {
        private String Customer_ID;
    private Map<String, Integer> book_items;

    public Cart() {

    }

    public Cart(String Customer_ID, Map<String, Integer> book_items) {
        this.Customer_ID = Customer_ID;
        this.book_items = book_items;


    }
    public String GetCustomerID() {
        return Customer_ID;
    }
    public void SetCustomerID(String Customer_ID) {
        this.Customer_ID = Customer_ID;
    }

    public Map<String , Integer> GetBookItems() {
        return book_items;
    }
    public void SetBookItems(Map<String , Integer> book_items) {
        this.book_items = book_items;
    }

}
