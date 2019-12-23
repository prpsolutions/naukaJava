package com.kodilla.ArrayList;

import java.util.Random;

public class Ksiazki {
    static Random r = new Random();


    public String nazwa = Ksiazki.getNazwa();
    public int rokWydania = r.nextInt(69) + 1950;
    public String autor = Ksiazki.getRandomName();
    public int rate = r.nextInt(10 + 1);



    public Ksiazki(){
        rate = r.nextInt(10);
    }
    public static String getRandomName(){
        String [] listaImion = {"Piotr Randak" , "Michal Zawadzki", "Patryk Bauman", "Antonii Krysik", "Patryk Nowak"};
        int losowyNr = r.nextInt(listaImion.length);
        return listaImion[losowyNr];
    }


    public static String getNazwa(){
        String [] listaImion = {"Wladca Pierscieni" , "Potop", "Harry Potter", "Ogniem i mieczem", "Hobbit"};
        int losowyNr = r.nextInt(listaImion.length);
        return listaImion[losowyNr];
    }


    @Override
    public String toString(){
        return nazwa + " z ocena = " + rate + " wydana w roku " + rokWydania + " przez autora - " + autor;
    }

}
