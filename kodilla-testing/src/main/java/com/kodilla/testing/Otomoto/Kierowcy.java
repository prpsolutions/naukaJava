package com.kodilla.testing.Otomoto;

import java.util.Objects;
import java.util.Random;

public class Kierowcy {
    private String dane = Kierowcy.getRandomDane();
    private String pesel = Kierowcy.randomPesel();
    static Random r = new Random();

    public static String randomPesel(){
        String q = "";
        String bb = "";
        String cc = "";
        String dd = "";
        int a = r.nextInt(50)+49;
        int b = r.nextInt(11)+1;
        if(b<=9){
            bb = 0 + "" + b;
        }else {
            bb = "" + b;
        };
        int c = r.nextInt(30)+1;
        if(c<=9){
            cc = 0 + "" + c;
        } else {
            cc = "" + c;
        };
        int d = r.nextInt(99999);
        if(d<=9999){
            dd = 0 + "" + d;
        } else if(d<=999){
            dd = "00"+d;
        } else if(d<=99){
            dd = "000"+d;
        } else if(d<=9){
            dd = "0000"+d;
        } else {
            dd = "" + d;
        };
        q = a+""+bb+""+cc+""+dd;
        return q;
    }

    public static String getRandomDane(){
        String [] tablicaImion={"Piotr" , "Marcin" , "Michal", "Lukasz" , "Wojciech", "Krzysztof","Grzegorz","Maciej", "Jan", "Kazimierz", "Andrzej"};
        int randomNumber = r.nextInt(tablicaImion.length);

        String [] tablicaNazwisk={"Sosnowski" , "Marcinkiewicz" , "Michalski", "Popielski" , "Dabkowski", "Sitarczyk","Slusarczyk","Maciejkiewicz", "Januszewski", "Kotwa", "Bejman"};
        int randomNumber2 = r.nextInt(tablicaNazwisk.length);
        return tablicaImion[randomNumber] +" "+ tablicaNazwisk[randomNumber2];
    }

    public String getDane(){
        return dane;
    }

    public String getPesel(){
        return pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kierowcy)) return false;
        Kierowcy kierowcy = (Kierowcy) o;
        return getDane().equals(kierowcy.getDane()) &&
                getPesel().equals(kierowcy.getPesel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDane(), getPesel());
    }

    @Override
    public String toString() {
        return  dane + " o numerze pesel = " + pesel;
    }
}
