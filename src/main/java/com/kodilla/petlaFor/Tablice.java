package com.kodilla.petlaFor;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Tablice {
    static Random liczbaLosowa = new Random();
    private static int[] tablica;

    public static int[] generatorTablic(int x){
        tablica = new int[x];
        // petla dodawajaca losowe liczby do tablicy z zakresu 0-100
        for (int i = 0; i < tablica.length; i++){
            tablica[i] = liczbaLosowa.nextInt(100);
            System.out.println("Losowa liczba od 0 do 100 nr. " + (i+1) + " to " + tablica[i]);
        }
        return tablica;
    }

    public static double calculateAverage(int[] tablica){

        int suma = 0;
        for (int i = 0; i < tablica.length; i++){
            suma += tablica[i];
        }
        int pomocnicza = suma;
        double srednia = suma / tablica.length;
        System.out.println("Suma powyzszych liczb to " + suma);
        System.out.println(" Srednia z tablicy " + tablica.length + " liczb , wynosi - " + srednia);
        return srednia;
    }

    public static int[] getTablice(){
        return tablica;
    }




    public void wypiszTablice(){
        for (int h: tablica){
            System.out.println(h);
        }
    }

    public static int[] streamowanie(int[] tablica){
        int[] m = tablica;

        // Using Arrays.stream() to convert
        // array into Stream

        IntStream stream = Arrays.stream(m);

        // Displaying elements in Stream
        stream.forEach(str -> System.out.print(str + " "));
        return tablica;
    }




    public void sredniaStream(int[] tablica){



    }










}
