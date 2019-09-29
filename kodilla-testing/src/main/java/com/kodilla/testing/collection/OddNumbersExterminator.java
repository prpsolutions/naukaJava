package com.kodilla.testing.collection;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.Random;

public class OddNumbersExterminator {
    private ArrayList<Integer> listaParzysta;
    private ArrayList<Integer> listaNieparzysta;


    public OddNumbersExterminator(){
        listaParzysta = new ArrayList<Integer>();
        listaNieparzysta = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getParzysteList(){
        return listaParzysta;
    }
    public ArrayList<Integer> getNieparzysteList(){
        return listaNieparzysta;
    }


    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        for (Integer f : numbers) {
            if (f % 2 == 0) {
                listaParzysta.add(f);
            }
        }
        return new ArrayList<>(getParzysteList());


    }


}
