package com.kodilla.iterator;

import java.util.ArrayList;
import java.util.Random;

public class BigTestData {
    public static void main (String[] args) throws java.lang.Exception
    {
        ArrayList<Integer> theBigList = new ArrayList<Integer>();
        Random theGenerator = new Random();
        for (int n=0; n<2000000; n++){
            theBigList.add(theGenerator.nextInt(50000));
        }
        // Check the list size
        System.out.println("The Big List contains now " + theBigList.size() + " objects");
    }
}
