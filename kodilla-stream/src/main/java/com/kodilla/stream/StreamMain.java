package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.person.People;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {
    public static void main(String[] args) {

        Forum obiektLista = new Forum();

        Map<Integer, ForumUser> mapaUzytkownikow = obiektLista.getUserList().stream()
                .filter(ForumUser -> ForumUser.getDateOfBirth().getYear() < 1999)
                .filter(ForumUser -> ForumUser.getSex() == 'M')
                .filter(ForumUser -> ForumUser.getPostsQuantity() > 1)
                .collect(Collectors.toMap(ForumUser::getIndexNr, ForumUser -> ForumUser));

        System.out.println("Stworzylem mape z " + mapaUzytkownikow.size() + " elementami \n ");

        mapaUzytkownikow.entrySet().stream()

                .map(entry -> "Obiekt klucz = " + entry.getKey() + " : oraz obiekt wartosc = " + entry.getValue())
                .forEach(System.out::println);


    }
}























/*

 BookDirectory theBookDirectory = new BookDirectory();
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));
        System.out.println("# elements: " + theResultMapOfBooks.size());
            theResultMapOfBooks.entrySet().stream()
                    .map(entry -> entry.getKey() + ": " + entry.getValue())
                    .forEach(System.out::println);




BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));
        System.out.println(theResultStringOfBooks);









        System.out.println("Welcome to module 7 - Stream");

        People.getList().stream()
                .forEach(System.out::println);

        System.out.println("");

        People.getList().stream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);

        System.out.println("");

        People.getList().stream()
                .filter(s -> s.length() > 11)
                .forEach(System.out::println);

        System.out.println();

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ')+2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);

       // NumbersGenerator obiekt = new NumbersGenerator();
       // obiekt.generateEven(100);



*/


