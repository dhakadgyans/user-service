package com.gyandevtools.userservices.entity;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Long UserId;
    private String Name;
    private String Address;
     List<Contact> contacts= new ArrayList<>();
    public User(Long userId, String name, String address) {
        UserId = userId;
        Name = name;
        Address = address;
    }

    public User() {
    }

    public User(Long userId, String name, String address, List<Contact> contacts) {
        UserId = userId;
        Name = name;
        Address = address;
        this.contacts = contacts;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long userId) {
        UserId = userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
