package com.kodilla.petlaFor;

public class App {
    public static void main (String[] args){

        Tablice obiekt = new Tablice();
        obiekt.generatorTablic(20);
        System.out.println(" ");
        obiekt.calculateAverage(obiekt.getTablice());

        obiekt.streamowanie(obiekt.getTablice());

    }
}
