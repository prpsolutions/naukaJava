package com.kodilla;

import java.util.Random;

public class Pracownik {
    private int indexNr;
    private String name = Pracownik.randomDane();
    private String budowa = Pracownik.randomBudowa();
    private String peselId = Pracownik.randomPesel();
    private String stanowisko = Pracownik.randomStanowisko();
    private static int nr = 0;

    static Random r = new Random();

    public Pracownik(){
        indexNr = nr;
        nr++;
    }

    public int getIndexNr(){
        return indexNr;
    }
    public String getDane(){
        return name;
    }
    public String getBudowa(){
        return budowa;
    }
    public String getPeselId(){
        return peselId;
    }

    public String getStanowisko(){
        return stanowisko;
    }

    public static String randomDane(){
        String [] tablicaImion={"Piotr" , "Marcin" , "Michal", "Lukasz" , "Wojciech", "Krzysztof","Grzegorz","Maciej", "Jan", "Kazimierz", "Andrzej"};
        int randomNumber = r.nextInt(tablicaImion.length);

        String [] tablicaNazwisk={"Sosnowski" , "Marcinkiewicz" , "Michalski", "Popielski" , "Dabkowski", "Sitarczyk","Slusarczyk","Maciejkiewicz", "Januszewski", "Kotwa", "Bejman"};
        int randomNumber2 = r.nextInt(tablicaNazwisk.length);
        return tablicaImion[randomNumber] +" "+ tablicaNazwisk[randomNumber2];
    }

    public static String randomBudowa(){
        String [] tablicaFabryk={"Esso Antwerpia","BASF Antwerpia","Botlek Rotterdam","Taminco Gent","RWE Groningen","DSM Geelen"};
        int randomNumber3 = r.nextInt(tablicaFabryk.length);
        return tablicaFabryk[randomNumber3];
    }
    public static String randomStanowisko(){
        String[] tablicaStanowisk={"Pomocnik","Monter","Supervisor"};
        int randomNumber4 = r.nextInt(tablicaStanowisk.length);
        return tablicaStanowisk[randomNumber4];
    }

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
    @Override
    public String toString(){
        return name + " "+
                " pracujacy na budowie " + budowa + " pesel = " + peselId + " na stanowisku " + stanowisko + "\n";
    }

    @Override
    public boolean equals(Object o){
        final Pracownik e = (Pracownik) o;
        return this.name.equals(e.name) && this.budowa.equals(e.budowa) && this.peselId.equals(e.peselId);
    }

    @Override
    public int hashCode(){
        return Integer.parseInt(peselId.substring(0, 5));
    }
}