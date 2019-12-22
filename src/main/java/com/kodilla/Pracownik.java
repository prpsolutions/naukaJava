package com.kodilla;

public class Pracownik {
    private String imieInazwisko;
    private int wiek;
    private int indexNr = 0;
    private static int index;

    public Pracownik(String imieInazwisko , int wiek) {
        this.imieInazwisko = imieInazwisko;
        this.wiek = wiek;
        this.indexNr = index;
        index ++;

    }

    public String getImieInazwisko() {
        return imieInazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public int getIndexNr() {
        return indexNr;
    }

    public static int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imieInazwisko='" + imieInazwisko + '\'' +
                ", wiek=" + wiek +
                ", indexNr=" + indexNr +
                '}';
    }
}