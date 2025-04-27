/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.book_application_store_system.Datas;

import com.bookstore.book_application_store_system.Models.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Thahe
 */
public class CustomerData {
   private static List<Customer> customers = new ArrayList<>();
    private static int currentId = 1;

    public static List<Customer> getAllCustomers() {
        return customers;
    }

    public static Customer getCustomerById(int id) {
        Optional<Customer> customer = customers.stream().filter(c -> c.getId() == id).findFirst();
        return customer.orElse(null);
    }

    public static Customer addCustomer(Customer customer) {
        customer.setID(currentId++);
        customers.add(customer);
        return customer;
    }

    public static Customer updateCustomer(int id, Customer updatedCustomer) {
        Customer existingCustomer = getCustomerById(id);
        if (existingCustomer != null) {
            existingCustomer.setName(updatedCustomer.getName());
            existingCustomer.setEmail(updatedCustomer.getEmail());
            existingCustomer.setPassword(updatedCustomer.getPassword());
        }
        return existingCustomer;
    }

    public static boolean deleteCustomer(int id) {
        return customers.removeIf(customer -> customer.getID() == id);
    }
    
}
