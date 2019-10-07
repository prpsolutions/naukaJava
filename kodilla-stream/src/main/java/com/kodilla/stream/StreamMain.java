package com.kodilla.stream.immutable;



public class StreamMain {
    public static void main(String[] args) {
        ForumUser obiekt = new ForumUser("Piotr", "Randak", "PRP", 31);
        ForumUser obiekt1 = new ForumUser("Michal", "Kardynalczyk", "ABCD", 32);
        ForumUser obiekt2 = new ForumUser("Patryk", "Bauman", "EFGH", 32);

        obiekt.addFriend(obiekt1);
        obiekt.addFriend(obiekt2);
        System.out.println(obiekt.toString());
    }
}