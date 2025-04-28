///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.bookstore.book_application_store_system.resources;
//
//import com.bookstore.book_application_store_system.Models.Order;
//import jakarta.ws.rs.Consumes;
//import jakarta.ws.rs.GET;
//import jakarta.ws.rs.POST;
//import jakarta.ws.rs.Path;
//import jakarta.ws.rs.PathParam;
//import jakarta.ws.rs.Produces;
//import jakarta.ws.rs.core.MediaType;
//import jakarta.ws.rs.core.Response;
//import java.util.List;
//
///**
// *
// * @author Thahe
// */
//
//@Path("/customers/{customerId}/orders")
//@Produces(MediaType.APPLICATION_JSON)
//@Consumes(MediaType.APPLICATION_JSON)
//public class OrderResource {
//    
//    @POST
//    public Response placeOrder(@PathParam("customerId") int customerId) {
//        Order order = DataStore.placeOrder(customerId);
//        return Response.status(Response.Status.CREATED).entity(order).build();
//    }
//
//    @GET
//    public List<Order> getOrders(@PathParam("customerId") int customerId) {
//        return DataStore.getOrders(customerId);
//    }
//
////    @GET
////    @Path("/{orderId}")
////    public Order getOrderById(@PathParam("customerId") int customerId,
////                              @PathParam("orderId") int orderId) {
////        return DataStore.getOrderById(customerId, orderId);
////    }
////    
//}
