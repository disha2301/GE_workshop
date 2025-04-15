package com.gevernova.workshoptwo;

public class Main {
    public static void main(String[] args) {
        ContactBook book = new ContactBook();

        book.add(new Contact("Disha", 123456, "disha@mail.com"));
        book.add(new Contact("Ahad", 789012, "ahad@mail.com"));

        book.displayAll();

        book.search(123456);

        book.remove(789012);

        book.displayAll();
    }
}