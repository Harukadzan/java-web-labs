package com.apress.users;

public class User {

    private String email;
    private String name;

    // default constructor
    public User() {
    }

    // constructor with parameters
    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }

    // getter for email
    public String getEmail() {
        return email;
    }

    // setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }
}
