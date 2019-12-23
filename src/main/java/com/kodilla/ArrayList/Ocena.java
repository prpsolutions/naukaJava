package com.kodilla.ArrayList;

public class Ocena {
    private int ocena;
    private String imieINazwisko;

    public Ocena(int ocena ,String imieINazwisko){
        this.ocena = ocena;
        this.imieINazwisko = imieINazwisko;
        if(ocena < 1 || ocena > 6) {
            throw new IllegalArgumentException("Podana wartosc jest nieprawidlowa");
        }
    }

    public int getOcena(){
        return ocena;
    }

    public String getDane(){
        return imieINazwisko;
    }
}
