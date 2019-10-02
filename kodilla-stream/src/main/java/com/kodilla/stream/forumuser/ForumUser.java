package com.kodilla.stream.forumuser;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

public class ForumUser {
    private static Random r = new Random();
    private final int indexNr;
    private final String name = ForumUser.getRandomName();
    private final char sex;
    private final LocalDate dateOfBirth = ForumUser.getRandomLocalDate();
    private final int postsQuantity = r.nextInt(10);
    private static int nr;

    public ForumUser() {
        this.indexNr = nr;
        if(this.name == "Piotr" || this.name == "Michal" || this.name == "Maciej") {
            sex = 'M';
        } else {
            sex = 'K';
        }
        nr++;
    }

    public static String getRandomName() {
        Random r = new Random();
        String[] tablicaImion = {"Piotr","Michal","Maciej","Katarzyna","Magda","Karolina","Anna"};
        int losowaLiczba = r.nextInt(tablicaImion.length);
        return tablicaImion[losowaLiczba];
    }
    public static LocalDate getRandomLocalDate() {
        Random r = new Random();
        int tablicaLat = r.nextInt(30)+1970;
        int tablicaMiesiecy = r.nextInt(11+1)+1;
        int tablicaDni;

        if(tablicaMiesiecy == 1 || tablicaMiesiecy == 3 || tablicaMiesiecy == 5 ||
                tablicaMiesiecy == 7 || tablicaMiesiecy == 8 ||
                    tablicaMiesiecy == 10 || tablicaMiesiecy == 12 ) {
                        tablicaDni = r.nextInt(30 + 1)+1;
        } else if (tablicaMiesiecy == 2) {
            tablicaDni = r.nextInt(27 + 1)+1;
        } else {
            tablicaDni = r.nextInt(29 + 1)+1;
        }
        return LocalDate.of(tablicaLat, tablicaMiesiecy, tablicaDni);
    }

    @Override
    public String toString() {
        return "ForumUser - " +
               // "indexNr = " + indexNr +
                 name +
                ", sex = " + sex +
                ", dateOfBirth = " + dateOfBirth +
                ", postsQuantity = " + postsQuantity;
    }

    public int getIndexNr() {
        return indexNr;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;
        ForumUser forumUser = (ForumUser) o;
        return getIndexNr() == forumUser.getIndexNr() &&
                getSex() == forumUser.getSex() &&
                getPostsQuantity() == forumUser.getPostsQuantity() &&
                getName().equals(forumUser.getName()) &&
                getDateOfBirth().equals(forumUser.getDateOfBirth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIndexNr(), getName(), getSex(), getDateOfBirth(), getPostsQuantity());
    }
}