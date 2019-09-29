package com.kodilla.testing.Otomoto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Auto {
    private int indexNr;
    private String marka = Auto.randomMarka();
    private int year = Auto.randomYear();
    private boolean ifCabrio = Auto.randomIfCabrio();
    private static int id = 1;


    public Auto(){
        this.indexNr = id;
        id++;
    }

    public static List<Auto> getListBryk(){
        final List<Auto> theList = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            theList.add(new Auto());
        }
        return new ArrayList<Auto>(theList);
    }




    public static String randomMarka() {
        Random r=new Random();
        String[] tablicaMarek={"Audi", "Mercedes", "BMW"};
        int randomNumber=r.nextInt(tablicaMarek.length);

        String[] tablicaModeliAudi={"A4", "A6", "A7", "A8"};
        int randomNumber1=r.nextInt(tablicaModeliAudi.length);

        String[] tablicaModeliMercedes={"C-Klasa", "E-Klasa", "S-Klasa"};
        int randomNumber2=r.nextInt(tablicaModeliMercedes.length);

        String[] tablicaModeliBMW={"335", "550", "760"};
        int randomNumber3=r.nextInt(tablicaModeliBMW.length);

        if (randomNumber == 0){
            return
                    tablicaMarek[randomNumber] + " " + tablicaModeliAudi[randomNumber1];
        }
        else if(randomNumber == 1){
            return tablicaMarek[randomNumber] + " " + tablicaModeliMercedes[randomNumber2];

        } else return tablicaMarek[randomNumber] + " " + tablicaModeliBMW[randomNumber3];
    }

    public static int randomYear() {
        int[] tablicaYear={2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019};
        Random r=new Random();
        int randomNumber=r.nextInt(tablicaYear.length);
        return
                tablicaYear[randomNumber];
    }

    public static boolean randomIfCabrio() {
        boolean[] tablicaIfCabrio={true , false};
        Random r=new Random();
        int randomNumber=r.nextInt(tablicaIfCabrio.length);
        return
                tablicaIfCabrio[randomNumber];
    }


    public String getMarka() {
        return marka;
    }

    public int getIndexNr() {
        return indexNr;
    }

    public int getYear() {
        return year;
    }

    public boolean isIfCabrio() {
        return ifCabrio;
    }

    @Override
    public String toString() {
        if(ifCabrio) {
            return  marka + ", rocznik = " + year + " - Nadwozie typu cabrio";
        } else return  marka + ", rocznik = " + year;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Auto)) return false;
        Auto auto = (Auto) o;
        return indexNr == auto.indexNr &&
                getYear() == auto.getYear() &&
                isIfCabrio() == auto.isIfCabrio() &&
                getMarka().equals(auto.getMarka());
    }

    @Override
    public int hashCode() {
        return Objects.hash(indexNr, getMarka(), getYear(), isIfCabrio());
    }
    public void streamowanie(int filterYear , String filterMarka){
        Auto.getListBryk().stream()
                .filter(s -> s.getMarka().length() > 1)
                .filter(s -> s.isIfCabrio())
                .filter(s -> s.getYear() < filterYear)
                .filter(s -> s.getMarka().substring(0, 1).equals(filterMarka))
                .forEach(System.out::println);
    }




}