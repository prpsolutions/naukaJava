package com.kodilla.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Biblioteka {
    private List<Ksiazki> bookList1 = new ArrayList<>();


    private List<Ksiazki> bookList2 = new ArrayList<>();


    public List<Ksiazki> getList1(){
        for(int i = 0; i < 100; i++){
            bookList1.add(new Ksiazki());
        }
        return new ArrayList<Ksiazki>(bookList1);
    }



    public List<Ksiazki> getList2(){
        for(int i = 0; i < 100; i++){
            bookList2.add(new Ksiazki());
        }
        for(int i = 0; i < 100; i++){
            bookList2.add(new Ksiazki());
        }
        return new ArrayList<Ksiazki>(bookList2);
    }




    public String metoda(Ksiazki aaaa){
        return aaaa.toString();
    }



}
