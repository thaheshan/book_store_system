/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.book_application_store_system.Datas;

import com.bookstore.book_application_store_system.Models.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author Thahe
 */
public class BookData {
    private static List<Book> books = new ArrayList<>();
    private static int nextId = 1;
    
    static {
        // Initialize with sample data
        addInitialBooks();
    }
    
    private static void addInitialBooks() {
        // Add sample books
        Book book1 = new Book(nextId++, "ay and night", 1, "978-0-7432-7356-5", 1925, 9.99, 50);
        Book book2 = new Book(nextId++, "Death of rebles", 2, "978-0-06-112008-4", 1960, 11.99, 75);
        books.add(book1);
        books.add(book2);
    }
    
    // Get all books
    public List<Book> getAllBooks() {
        return books;
    }
    
    // Get book by ID
    public Book getBookById(int id) {
        return books.stream()
                .filter(book -> book.getId() == id)
                .findFirst()
                .orElse(null);
    }
    
    // Add a new book
    public Book addBook(Book book) {
        book.setId(nextId++);
        books.add(book);
        return book;
    }
    
    // Update an existing book
    public Book updateBook(Book updatedBook) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == updatedBook.getId()) {
                books.set(i, updatedBook);
                return updatedBook;
            }
        }
        return null;
    }
    
    // Delete a book
    public boolean deleteBook(int id) {
        return books.removeIf(book -> book.getId() == id);
    }
    
    // Get books by author
    public List<Book> getBooksByAuthor(int authorId) {
        return books.stream()
                .filter(book -> book.getAuthorId() == authorId)
                .collect(Collectors.toList());
    }
    
    // Check if a book is in stock
    public boolean isBookInStock(int id, int quantity) {
        Book book = getBookById(id);
        return book != null && book.getStock() >= quantity;
    }
    
    // Update stock
    public boolean updateStock(int id, int quantity) {
        Book book = getBookById(id);
        if (book != null && book.getStock() >= quantity) {
            book.setStock(book.getStock() - quantity);
            return true;
        }
        return false;
    }
    
}
