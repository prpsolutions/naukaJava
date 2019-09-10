package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

import java.util.Random;


public class TestingMain {
    public static void main(String [] args){
        Random r = new Random();

        Calculator obiekt1 = new Calculator(r.nextInt(10),r.nextInt(10));

    // test nr. 1 - metody .getA
        Integer result = obiekt1.getA();
        System.out.println("Test nr. 1");
        if (result.equals(obiekt1.getA()) ){
            System.out.println("OK \n");
        } else {
            System.out.println("Error! \n");
        }

    // test nr. 2 - metody .getB
        result = obiekt1.getB();
        System.out.println("Test nr. 2");
        if (result.equals(obiekt1.getB()) ){
            System.out.println("OK \n");
        } else {
            System.out.println("Error! \n");
        }

    // test nr. metody .dodawanie
        result = obiekt1.dodawanie();
        System.out.println("Test nr. 3");
        if (result.equals(obiekt1.dodawanie()) ){
            System.out.println("OK \n");
        } else {
            System.out.println("Error! \n");
        }
    // test metody .odejmowanie
        result = obiekt1.odejmowanie();
        System.out.println("Test nr. 4");
        if (result.equals(obiekt1.odejmowanie()) ){
            System.out.println("OK \n");
        } else {
            System.out.println("Error! \n");
        }
    }
}
