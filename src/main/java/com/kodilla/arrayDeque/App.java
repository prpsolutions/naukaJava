package com.kodilla.arrayDeque;

import java.util.ArrayDeque;

public class App {
    public static void main (String[] args) {

        System.out.println("Tworzymy kolejke z 50 elementami typu String");

        ArrayDeque<String> taskQueue1 = new ArrayDeque<String>();
        for(int n=0; n<50; n++){
            taskQueue1.offer(TaskManager.AGenerator());
        }
        System.out.println(" Lista obiektow w kolejce - " + taskQueue1.size() + " \n");

        System.out.println("Nastepnie tworzymy obiekt klasy TaskManager i podajemy do argumentu metody tej klasy nasza utworzona kolejke - metoda ta ma podzielic kolejke na dwie ArrayListy - jedna z parzysta liczba znakow w Stringu , druga z nieparzystą \n");

        TaskManager obiekt = new TaskManager();
        obiekt.splitStrings(taskQueue1);

        System.out.println("Liczba obiektow w liscie z parzysta liczba znakow A - " + obiekt.getParzysteList().size() + "\n");

        System.out.println("Liczba obiektow w liscie z nieparzysta liczba znakow A - " + obiekt.getNieparzysteList().size() + " \n\n");

    }
}
