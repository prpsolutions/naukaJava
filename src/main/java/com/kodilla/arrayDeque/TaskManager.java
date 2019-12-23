package com.kodilla.arrayDeque;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TaskManager {
    private ArrayList<String> listaParzysta;
    private ArrayList<String> listaNieparzysta;

    private static Random rr = new Random();

    public TaskManager(){
        listaParzysta = new ArrayList<String>();
        listaNieparzysta = new ArrayList<String>();
    }

    public void splitStrings(ArrayDeque<String> theQueue){
        while (theQueue.size() > 0){
            String theTask = theQueue.poll();
            if(theTask.length() % 2 == 0){
                listaParzysta.add(theTask);
            } else {
                listaNieparzysta.add(theTask);
            }
        }
    }

    public List<String> getParzysteList(){
        return listaParzysta;
    }
    public List<String> getNieparzysteList(){
        return listaNieparzysta;
    }


    public static String AGenerator(){
        String randomAArgument = TaskManager.getAlphaNumericString();
        return randomAArgument;
    }

    static String getAlphaNumericString() {
        int n = rr.nextInt(49)+1;
        String AlphaNumericString = "A";
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());
            sb.append(AlphaNumericString
                    .charAt(index));}
        return sb.toString();
    }
}
