package com.gevernova.workshoptwo;

public class ContactBook {
    private Contact[] contacts = new Contact[5];
    private int count = 0;

    public void add(Contact c) {
        if (count == contacts.length) {
            System.out.println("Contact book full");
            return;
        }
        for (int i = 0; i < count; i++) {
            if (contacts[i].getPhone() == c.getPhone()) {
                System.out.println("Phone number already exists.");
                return;
            }
        }
        contacts[count++] = c;
        System.out.println("Contact added.");
    }

    public void remove(long phone) {
        for (int i = 0; i < count; i++) {
            if (contacts[i].getPhone() == phone) {
                for (int j = i; j < count - 1; j++) {
                    contacts[j] = contacts[j + 1];
                }
                contacts[--count] = null;
                System.out.println("Contact removed.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void search(long phone) {
        for (int i = 0; i < count; i++) {
            if (contacts[i].getPhone() == phone) {
                System.out.println("Contact found:");
                contacts[i].show();
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void displayAll() {
        if (count == 0) {
            System.out.println("No contacts to display.");
            return;
        }
        for (int i = 0; i < count; i++) {
            contacts[i].show();
        }
    }
}
