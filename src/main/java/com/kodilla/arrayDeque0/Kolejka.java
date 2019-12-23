package com.kodilla.arrayDeque0;

import java.util.ArrayDeque;

public class Kolejka {
    private ArrayDeque<Book> theBooks = new ArrayDeque<Book>();
    private Book temporaryOrder;
    private Book pomocniczaX;


    public void makeBooks(){
        Book theBook1 = new Book("Assassins' Creed the Book", "William Shakespeare", 2016);
        Book theBook2 = new Book("Book of jungle", "Rudyard Kipling", 1894);
        Book theBook3 = new Book("50 shades of gray - lexicon for graphicians", "Dante Alighieri", 1572);
        Book theBook4 = new Book("Lord of The Rings", "J.R.R. Tolkien", 1950);
        Book theBook5 = new Book("Harry Potter", "J.K Rowling", 1998);


        theBooks.push(theBook1);
        theBooks.push(theBook2);
        theBooks.push(theBook3);
        theBooks.push(theBook4);
        theBooks.push(theBook5);

        System.out.println("Queue is created. It's size: " + theBooks.size());
    }

    public void deleteBooks(){
        for (Book w: theBooks){
            temporaryOrder = theBooks.pop();
        }
        System.out.println("Queue is emptied. It's size: " + theBooks.size());
        System.out.println("Last order taken from queue was:\n" + temporaryOrder);
    }
}
