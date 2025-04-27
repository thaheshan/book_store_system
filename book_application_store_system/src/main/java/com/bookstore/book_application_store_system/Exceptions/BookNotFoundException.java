/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.book_application_store_system.Exceptions;

/**
 *
 * @author Thahe
 */
public class BookNotFoundException extends RuntimeException {
    
    public BookNotFoundException(int id) {
        super("Book with ID"+ id + "Not Found! ");
        
    }
    
}
