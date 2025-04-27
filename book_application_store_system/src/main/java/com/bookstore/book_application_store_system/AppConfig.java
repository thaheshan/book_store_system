package com.bookstore.book_application_store_system;

import com.bookstore.book_application_store_system.resources.BookResource;
import com.bookstore.book_application_store_system.resources.AuthorResource;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class AppConfig extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<>();
        resources.add(BookResource.class); 
        resources.add(AuthorResource.class);// Register your resource class
        return resources;
    }
}
