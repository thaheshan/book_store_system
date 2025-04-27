/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.book_application_store_system.Datas;

import com.bookstore.book_application_store_system.Models.Order;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Thahe
 */
public class OrderData {
    private static Map<Integer, List<Order>> ordersByCustomer = new HashMap<>();
    private static int currentOrderId = 1;

    public static List<Order> getOrdersForCustomer(int customerId) {
        return ordersByCustomer.getOrDefault(customerId, new ArrayList<>());
    }

    public static Order getOrderById(int customerId, int orderId) {
        List<Order> orders = ordersByCustomer.get(customerId);
        if (orders != null) {
            for (Order order : orders) {
                if (order.getId() == orderId) {
                    return order;
                }
            }
        }
        return null;
    }

    public static Order createOrder(int customerId, List<OrderItem> items) {
        Order order = new Order(currentOrderId++, customerId);
        order.getItems().addAll(items);
        ordersByCustomer.computeIfAbsent(customerId, k -> new ArrayList<>()).add(order);
        return order;
    }
    
}
