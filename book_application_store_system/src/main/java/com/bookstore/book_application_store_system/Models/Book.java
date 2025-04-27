package com.bookstore.book_application_store_system.Models;

/**
 * Represents a Book with all its relevant attributes.
 * 
 * Author: Thahe
 */
public class Book {

    // Book attributes
    private int bookId;
    private String bookTitle;
    private String bookAuthor;
    private String bookPublisher;
    private String authorBiography;
    private int authorId;
    private String bookISBN;
    private int publicationYear;
    private double bookPrice;
    private int bookStockCount;

    // Default constructor
    public Book() {}

    // Full parameterized constructor
    public Book(int bookId, String bookTitle, String bookAuthor, String bookPublisher,
                String authorBiography, int authorId, String bookISBN,
                int publicationYear, double bookPrice, int bookStockCount) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPublisher = bookPublisher;
        this.authorBiography = authorBiography;
        this.authorId = authorId;
        this.bookISBN = bookISBN;
        this.publicationYear = publicationYear;
        this.bookPrice = bookPrice;
        this.bookStockCount = bookStockCount;
    }

    // Getter and Setter methods

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public String getAuthorBiography() {
        return authorBiography;
    }

    public void setAuthorBiography(String authorBiography) {
        this.authorBiography = authorBiography;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getBookISBN() {
        return bookISBN;
    }

    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getBookStockCount() {
        return bookStockCount;
    }

    public void setBookStockCount(int bookStockCount) {
        this.bookStockCount = bookStockCount;
    }

    // Additional convenience methods based on your earlier request:

    // These are just alternate getters/setters following your old naming
    public void setBook_ID(int id) {
        this.bookId = id;
    }

    public Integer getBook_ID() {
        return bookId;
    }

    public int getId() {
        return bookId;
    }

    public void setId(int id) {
        this.bookId = id;
    }

    public int getStock() {
        return bookStockCount;
    }

    public void setStock(int stock) {
        this.bookStockCount = stock;
    }
}
