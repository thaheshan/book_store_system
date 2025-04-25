// File: src/main/java/com/bookstore/book_store_application/BookstoreApplication.java
package com.bookstore.book_store_application;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * BookstoreApplication configures the Jersey resource scanning.
 */
public class book_store_application extends ResourceConfig {

    public book_store_application() {
        // This method is inherited from ResourceConfig
        packages("com.bookstore.book_store_application.Resources",
                 "com.bookstore.book_store_application.Exceptions");
    }
}
