/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.book_store_application;

import java.net.URI;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;

/**
 *
 * @author Thahe
 * 
 */



public class Main {
    
        private static final String BASE_URI = "http://0.0.0.0:8080/api/";

    public static void main(String[] args) {
        HttpServer server = GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI));
        System.out.println("BookStore API started at: " + BASE_URI);
        Runtime.getRuntime().addShutdownHook(new Thread(server::shutdownNow));
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
 
    
}
