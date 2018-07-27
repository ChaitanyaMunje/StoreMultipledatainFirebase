package com.example.chaitanya.demoapp;

public class User {
    private String Name;
    private String Email;
    private String Phone;
    private String Username;
    private String Password;

    public User(){

    }

    public User(String name, String email, String phone, String username, String password) {
        Name = name;
        Email = email;
        Phone = phone;
        Username = username;
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
