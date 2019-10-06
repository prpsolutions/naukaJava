package com.kodilla.stream.immutable;

import java.util.List;

public final class ForumUser {
    private final String name;
    private final String surname;
    private final String login;
    private final int age;
    private final List<ForumUser> friends;

    public ForumUser(final String name, final String surname, final String login, final int age) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLogin() {
        return login;
    }

    public List<ForumUser> getFriendsList() {
        return friends;
    }

    public int getAge() {
        return age;
    }

    public void addFriend(ForumUser newFriend) {
        friends.add(newFriend);
    }
}
