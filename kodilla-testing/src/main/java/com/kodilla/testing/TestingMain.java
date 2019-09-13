package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;
import java.util.Random;


public class TestingMain {
    static Random r = new Random();
    ArrayList<Integer> numbers;

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();;

        for (int i = 0; i < 100; i++) {
            numbers.add(r.nextInt(100));
        }



        OddNumbersExterminator obiekt = new OddNumbersExterminator();
        obiekt.exterminate(numbers);
    }


    }



/*
 public static void main(String [] args){
        Random r = new Random();

        Calculator obiekt1 = new Calculator();


    // test nr. metody .dodawanie
        Integer result = obiekt1.dodawanie(6,7);
        System.out.println("Test nr. 1");
        if (result.equals(obiekt1.dodawanie(6,7)) ){
            System.out.println("OK \n");
        } else {
            System.out.println("Error! \n");
        }
    // test metody .odejmowanie
        result = obiekt1.odejmowanie(5,6);
        System.out.println("Test nr. 2");
        if (result.equals(obiekt1.odejmowanie(5,6)) ){
            System.out.println("OK \n");
        } else {
            System.out.println("Error! \n");
        }
    }
 */


