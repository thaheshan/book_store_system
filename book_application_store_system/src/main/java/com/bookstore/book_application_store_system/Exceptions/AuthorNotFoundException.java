package com.bookstore.book_application_store_system.Exceptions;

/**
 *
 * @author Thahe
 */
public class AuthorNotFoundException extends RuntimeException {

    public AuthorNotFoundException(int authorId) {
        super("Author with ID " + authorId + " not found!");
    }
}
