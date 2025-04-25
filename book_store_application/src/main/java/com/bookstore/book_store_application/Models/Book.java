/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.book_store_application.Models;

/**
 *
 * @author Thahe
 */
public class Book {
    
    //declare variables to create attributes of the book object for the project instances
    private int Book_ID;
    private String Book_Title;
    private String Book_Author;
    private String Book_Publisher;
    private String Author_Biography;
    private String Author_ID;
    private String Book_ISBN;
    private int Publication_year;
    private Double Book_Price;
    private int Book_Stock_Count;

    //create constructor to construct the attributed into instances.

    public Book() {

    }
    public Book(int Booking_ID, String Book_title, String Book_Author, String Book_Publisher , String Author_Biography,String Author_ID, String Nook_ISBN, int Publication_year, Double Book_Price, int Book_Stock_Count ) {
        this.Book_ID = Booking_ID;
        this.Book_Title = Book_title;
        this.Book_Author = Book_Author;
        this.Book_Publisher = Book_Publisher;
        this.Author_Biography = Author_Biography;
        this.Author_ID = Author_ID;
        this.Book_ISBN = Book_ISBN;
        this.Publication_year = Publication_year;
        this.Book_Price = Book_Price;
        this.Book_Stock_Count = Book_Stock_Count;



    }
    public int getBook_ID() {
        return Book_ID;
    }
    public void SetBook_ID(int Book_ID) {
        this.Book_ID = Book_ID;
    }


    public String getBook_Title() {
        return Book_Title;
    }
    public void SetBook_Title(String Book_Title) {
        this.Book_Title = Book_Title;
    }


    public String getBook_Author() {
        return Book_Author;
    }
    public void SetBook_Author(String Book_Author) {
        this.Book_Author = Book_Author;
    }


    public String getBook_Publisher() {
        return Book_Publisher;
    }
    public void SetBook_Publisher(String Book_Publisher) {
        this.Book_Publisher = Book_Publisher;
    }


    public String getAuthor_Biography() {
        return Author_Biography;
    }
    public void SetAuthor_Biography(String Author_Biography) {
        this.Author_Biography = Author_Biography;


    }


 
    public void SetAuthor_ID(String Author_ID) {
        this.Author_ID = Author_ID;
    }


    public String getBook_ISBN() {
        return Book_ISBN;
    }
    public void SetBook_ISBN(String Book_ISBN) {
        this.Book_ISBN = Book_ISBN;
    }


    public int getPublication_year() {
        return Publication_year;
    }
    public void SetPublication_year(int Publication_year) {
        this.Publication_year = Publication_year;
    }


    public Double getBook_Price() {
        return Book_Price;
    }
    public void SetBook_Price(Double Book_Price) {
        this.Book_Price = Book_Price;
    }


    public int getBook_Stock_Count() {
        return Book_Stock_Count;
    }
    public void SetBook_Stock_Count(int Book_Stock_Count) {
        this.Book_Stock_Count = Book_Stock_Count;
    }


}
