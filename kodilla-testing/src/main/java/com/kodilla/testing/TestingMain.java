package com.kodilla.testing;
import com.kodilla.testing.Otomoto.Auto;
import com.kodilla.testing.Otomoto.SalonSamochodowy;
import com.kodilla.testing.Otomoto.Zamowienia;
import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.user.SimpleUser;

import java.util.ArrayList;
import java.util.Random;

public class TestingMain {

    public static void main(String[] args) {

    Auto obiekt = new Auto();
    obiekt.streamowanie(2017 ,"A");









    }
}







/*

 Random r = new Random();

 ArrayList<Integer> numbers = new ArrayList<>();;

        for (int i = 0; i < 100; i++) {
            numbers.add(r.nextInt(100));
        }

        OddNumbersExterminator obiekt = new OddNumbersExterminator();
        obiekt.exterminate(numbers);

        System.out.println(obiekt.getNieparzysteList().size());
        System.out.println(obiekt.getParzysteList());









        ArrayList<Integer> numbers = new ArrayList<>();;

        for (int i = 0; i < 100; i++) {
            numbers.add(r.nextInt(100));
        }



        OddNumbersExterminator obiekt = new OddNumbersExterminator();
        obiekt.exterminate(numbers);






     SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        System.out.println("Test nr 0");
        if (result.equals("theForumUser")) {
            System.out.println("OK");
        } else {
            System.out.println("Error!");
        }
        //test metody dodawanie

        Calculator obiekt1 = new Calculator();

        Integer result1 = obiekt1.dodawanie(6,7);
        System.out.println(" \nTest nr. 1");
        if (result1.equals(obiekt1.dodawanie(6,7)) ){
            System.out.println("OK \n");
        } else {
            System.out.println("Error! \n");
        }


        // test metody .odejmowanie
        result1 = obiekt1.odejmowanie(5,6);
        System.out.println("Test nr. 2");
        if (result1.equals(obiekt1.odejmowanie(5,6)) ){
            System.out.println("OK \n");
        } else {
            System.out.println("Error! \n");
        }
    }















 */


