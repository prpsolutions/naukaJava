package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

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