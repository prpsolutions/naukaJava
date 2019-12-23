package com.kodilla.ArrayList;

public class App {
    public static void main (String[] args) throws java.lang.Exception
    {

        Ksiazki obiekt1 = new Ksiazki();
        Ksiazki obiekt2 = new Ksiazki();
        Ksiazki obiekt3 = new Ksiazki();
        Ksiazki obiekt4 = new Ksiazki();
        Ksiazki obiekt5 = new Ksiazki();
        Ksiazki obiekt6 = new Ksiazki();
        Ksiazki obiekt7 = new Ksiazki();
        Ksiazki obiekt8 = new Ksiazki();
        Ksiazki obiekt9 = new Ksiazki();
        Ksiazki obiekt10 = new Ksiazki();


        Biblioteka obiekt = new Biblioteka();

        System.out.println(obiekt.metoda(obiekt1));
        System.out.println(obiekt.getList1().size());


        DziennikOcen klasa3L = new DziennikOcen();
        klasa3L.fillByOceny();
        klasa3L.process();



    }
}
