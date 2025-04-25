/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookstore.book_store_application.Models;

/**
 *
 * @author Thahe
 */
public class Customer {
    
      private String ID;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Phone;
    private String Password;

    public Customer() {

    }

    public Customer(String Customer_ID, String FirstName, String LastName, String Email, String Phone, String Password) {

        this.ID = Customer_ID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.Phone = Phone;
        this.Password = Password;

    }
    public String getID() {
        return ID;
    }
    public void setID(String ID) {
        this.ID = ID;
    }


    public String getFirstName() {
        return FirstName;
    }
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }


    public String getLastName() {
        return LastName;
    }
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }


    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }


    public String getPhone() {
        return Phone;
    }
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }


    public String getPassword() {
        return Password;
    }
    public void setPassword(String Password) {
        this.Password = Password;
    }
    
}
