package com.kodilla.hashSet;

import java.util.HashSet;

public class BookDirectory {
    private final HashSet<Book> booksSet = new HashSet<>();

    public BookDirectory() {
        Book book1 = new Book("Wladca Pierscieni","J.R.R. Tolkien",  2001, 6);
        Book book2 = new Book("Harry Potter","J.K. Rowling", 2005, 2);
        Book book3 = new Book("Hobbit","J.R.R. Tolkien", 1985, 6);
        Book book4 = new Book("Potop","Henryk Sienkiewicz", 1884, 10);
        Book book5 = new Book("Ogniem i Mieczem","Henryk Sienkiewicz", 1886, 4);

        booksSet.add(book1);
        booksSet.add(book2);
        booksSet.add(book3);
        booksSet.add(book4);
        booksSet.add(book5);
    }
    public HashSet<Book> getSet() {
        return new HashSet<>(booksSet);
    }
}
