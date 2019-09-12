package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

import java.util.Random;


public class TestingMain {
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
}
