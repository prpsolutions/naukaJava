package com.kodilla.hashSet;

public class App {
    public static void main (String[] args) {

        BookDirectory obiekt = new BookDirectory();

        obiekt.getSet().stream()
                .filter(s -> s.getDate().getYear() < 2000)
                .forEach(System.out::println);
    }
}
