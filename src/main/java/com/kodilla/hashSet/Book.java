package com.kodilla.hashSet;

import java.time.YearMonth;
import java.util.Objects;

public class Book {
    private final String name;
    private final String author;
    private final YearMonth date;

    public Book(final String name,final String author,final int year,
                final int month){
        this.name = name;
        this.author = author;
        this.date = YearMonth.of(year, month);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getName().equals(book.name) &&
                getAuthor().equals(book.author) &&
                getDate().equals(book.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAuthor(), getDate());
    }

    public String toString(){
        return name + ", " + ", written by " + author + " on " + date;
    }

    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }

    public YearMonth getDate(){
        return date;
    }
}
