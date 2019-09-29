package com.kodilla.stream.immutable;

public final class ForumUser {
    private final String name;
    private final String surname;
    private final String login;
    private final int age;

    public ForumUser(final String name,final String surname,final String login,final int age) {
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

    public int getAge() {
        return age;
    }
}
