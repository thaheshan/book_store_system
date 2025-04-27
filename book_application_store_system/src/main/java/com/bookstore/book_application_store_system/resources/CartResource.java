/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.book_application_store_system.resources;

import com.bookstore.book_application_store_system.Datas.CartData;
import com.liferay.headless.commerce.delivery.cart.dto.v1_0.CartItem;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;

/**
 *
 * @author Thahe
 */



@Path("/customers/{customerId}/Carts")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class CartResource {
    
  @POST
    @Path("/items")
    public Response addItemToCart(@PathParam("customerId") int customerId, CartItem item) {
        CartData.addItemToCart(customerId, item);  // Directly using CartData to add item to cart
        return Response.status(Response.Status.CREATED).build();
    }

    @GET
    public List<CartItem> viewCart(@PathParam("customerId") int customerId) {
        return CartData.getCartItems(customerId);  // Directly using CartData to fetch items
    }

    @PUT
    @Path("/items/{bookId}")
    public CartItem updateCartItem(@PathParam("customerId") int customerId,
                                   @PathParam("bookId") int bookId,
                                   CartItem item) {
        return CartData.updateCartItem(customerId, bookId, item);  // Directly using CartData to update item
    }

    @DELETE
    @Path("/items/{bookId}")
    public Response removeCartItem(@PathParam("customerId") int customerId,
                                   @PathParam("bookId") int bookId) {
        boolean removed = CartData.removeItemFromCart(customerId, bookId);  // Directly using CartData to remove item
        if (removed) {
            return Response.noContent().build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
    
}
