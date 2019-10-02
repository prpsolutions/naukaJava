package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum userMap = new Forum();
        Map<Integer, ForumUser> mapaUzytkownikow = userMap.getUserList().stream()
                .filter(forumUser -> forumUser.getDateOfBirth().getYear() < 1999)
                .filter(forumUser -> forumUser.getSex() == ForumUser.Sex.M)
                .filter(forumUser -> forumUser.getPostsQuantity() > 1)
                .collect(Collectors.toMap(ForumUser::getIndexNr, Function.identity()));

        System.out.println("Stworzylem mape z " + mapaUzytkownikow.size() + " elementami \n ");
        mapaUzytkownikow.entrySet().stream()

                .map(entry -> "Obiekt klucz = " + entry.getKey() + " : oraz obiekt wartosc = " + entry.getValue())
                .forEach(System.out::println);
    }
}