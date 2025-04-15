package com.gevernova.workshoptwo;

public class Contact {
    private String name;
    private long phone;
    private String email;

    public Contact(String name, long phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("-------------------");
    }
}

