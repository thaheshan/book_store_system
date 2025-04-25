/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.book_store_application.Models;

/**
 *
 * @author Thahe
 */
public class Author {
    
    private int Author_ID;
    private String Author_First_Name;
    private String Author_Last_Name;
    private String Author_Biography;
    private String Author_Email;

    public Author() {

        
        
        

    }

    public  Author(int Author_ID, String Author_First_Name, String Author_Last_Name, String Author_Biography, String Author_Email) {
        this.Author_ID = Author_ID;
        this.Author_First_Name = Author_First_Name;
        this.Author_Last_Name = Author_Last_Name;
        this.Author_Biography = Author_Biography;
        this.Author_Email = Author_Email;

    }
    public int GetAuthor_ID() {
       return Author_ID;
    }
    public void SetAuthor_ID(int Author_ID) {
        this.Author_ID = Author_ID;
    }


    public String GetAuthor_First_Name() {
        return Author_First_Name;
    }
    public void SetAuthor_First_Name(String Author_First_Name) {
        this.Author_First_Name = Author_First_Name;

    }

    public String GetAuthor_Last_Name() {
        return Author_Last_Name;
    }
    public void SetAuthor_Last_Name(String Author_Last_Name) {
        this.Author_Last_Name = Author_Last_Name;
    }


    public String GetAuthor_Biography() {
        return Author_Biography;
    }
    public void SetAuthor_Biography(String Author_Biography) {
        this.Author_Biography = Author_Biography;
    }

    public String GetAuthor_Email() {
        return Author_Email;
    }
    public void SetAuthor_Email(String Author_Email) {
        this.Author_Email = Author_Email;
    }

    
}
